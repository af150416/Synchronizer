package com.softbistro.declarations.jparser.parsing.json.component.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Driver;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.IncomeDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.LuxuryThingsDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.PersonFamilyDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.PersonInfoDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.RealutyDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.SharesDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.TypeDao;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.VechiclesDao;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IIncome;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.ILuxuryThings;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IPersonInfo;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRealuty;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IShares;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.ISubjectFamily;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IType;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IVechicles;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Income;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.LuxuryThings;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonFamily;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonInfo;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Realuty;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Shares;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Type;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Vechicles;

/**
 * Service that write to database information about declaration
 * 
 * @author cortes
 *
 */
@Service
public class MigrationToDatabase {

	private static Integer personId;

	private static final String INSERT_INTO_TYPE = "INSERT INTO type (declaration_type, declaration_year, person_id, declaration_id)"
			+ " VALUES (:declarationType, :declarationYear, :personId, :declarationId) ON DUPLICATE KEY UPDATE declaration_id = :declarationId";

	private static final String INSERT_TO_SUBJECT_INFO = "INSERT INTO subject_info (id, country, last_name, first_name, middle_name, post_type, work_post, work_place, post_category, "
			+ "changed_name, country_path, corruption_affected, previous_last_name, previous_first_name, previous_middle_name, status, responsible_position, actual_city,"
			+ "actual_district, actual_region, actual_country, subject_id) "
			+ "VALUES(:id, :country, :lastName, :firstName, :middleName, :postType, :workPost, :workPlace, :postCategory, :changedName, :countryPath, :corruptionPost, :previousLastName, "
			+ ":previousFirstName, :previousMiddleName, 'DECLARANT', :responsiblePosition, :actualCity, :actualDistrict, :actualRegion, :actualCountry, :subjectId)";

	private static final String INSERT_FAMILY_INFO = "INSERT INTO subject_family (last_name, first_name, middle_name, changed_name, previous_last_name, previous_first_name,"
			+ " previous_middle_name, family_subject_id, declarant_id, citizenship, subject_relation) VALUES(:lastName, :firstName, :middleName, :changedName, :previousLastName, "
			+ ":previousFirstName, :previousMiddleName, :familySubjectId, :declarantId, :citizenship, :subjectRelation)";

	private static final String INSERT_INTO_REALUTY = "INSERT INTO realuty (person_id, rights_id, cost_date, total_area, object_type, owning_date, ua_post_code, other_object_type, iteration"
			+ ", city_type) VALUES (:personId, :rightsId, :costDate, :totalArea, :objectType, :owningDate, :uaPostCode, :otherObjectType, :iteration, :cityType)";

	private static final String INSERT_INTO_RIGHTS = "INSERT INTO rights (person_id, citizen, city, ua_last_name, ua_first_name, ua_middle_name, eng_last_name, ownership_type, "
			+ "other_ownership, ua_company_name, eng_company_name,percent_ownership) VALUES (:personId, :citizen, :city, :uaLastName, :uaFirstName, :uaMiddleName, "
			+ ":engLastName, :ownershipType, :otherOwnership, :uaCompanyName, :engCompanyName, :percentOwnership)";

	private static final String INSERT_TO_VECHICLES = "INSERT INTO vechicles (brand, model, person_id, rights_id, cost_date, iteration, object_type, owning_date, graduation_year, "
			+ "other_object_type) VALUES (:brand, :model, :personId, :rightsId, :costDate, :iteration, :objectType, :owningDate, :graduationYear, :otherObjectType)";

	private static final String INSERT_INTO_INCOME_GIFTS = "INSERT INTO income (person_id, rights_id, iteration, object_type, size_income, income_source, source_citizen, source_ua_company_name)"
			+ "VALUES (:personId, :rightsId, :iteration, :objectType, :incomeSize, :incomeSource, :sourceCitizen, :sourceUaCompanyName)";

	private static final String INSERT_INTO_INCOME_ASSETS = "INSERT INTO income (person_id, rights_id, object_type, organization, assets_currency, organization_type, org_ua_company_name)"
			+ "VALUES (:personId, :rightsId, :objectType, :organization, :assetsCurrency, :organizationType, :organizationUaCompanyName)";

	private static final String INSERT_INTO_SHARES_SECURITIES = "INSERT INTO shares (cost, amount, person_id, rights_id, emitent, iteration, owning_date, emitent_type, type_property,"
			+ "emitent_ua_company_name) "
			+ "VALUES (:cost, :amount, :personId, :rightsId, :emitent, :iteration, :owningDate, :emitentType, :typeProperty, :emitentUaConmpanyName)";

	private static final String INSERT_INTO_SHARES_CORPORATELAW = "INSERT INTO shares (cost, rights_id, `name`, iteration, legal_form, cost_percent, country) "
			+ "VALUES (:cost, :rightsId, :name, :iteration, :legalForm, :costPercent, :country)";

	private static final String INSERT_INTO_SHARES_RECIPIENTPAY = "INSERT INTO shares (person_id, iteration,`name`, country, en_name, legal_form) "
			+ "VALUES (:personId, :iteration, :name, :country, :enName, :legalForm)";

	private static final String INSERT_INTO_LUXURY_THINGS = "INSERT INTO luxury_things (person_id, rights_id, date_use, iteration, trademark, object_type, property_descr, other_object_type,"
			+ " manufacturer_name) VALUES (:personId, :rightsId, :dateUse, :iteration, :trademark, :objectType, :propertyDescr, :otherObjectType, :manufacturerName)";

	/**
	 * Update status in database
	 */
	private static final String SQL_UPDATE_VALUE_STATUS = "UPDATE staging_declaration SET status = ? WHERE status = ? LIMIT ? ";

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(connectToDB());

	private IType iType = new TypeDao();

	private IPersonInfo iPersonInfo = new PersonInfoDao();

	private ISubjectFamily iSubjectFamily = new PersonFamilyDao();

	private IRealuty iRealuty = new RealutyDao();

	private IIncome iIncome = new IncomeDao();

	private IVechicles iVechicles = new VechiclesDao();

	private IShares iShares = new SharesDao();

	private ILuxuryThings iLuxuryThings = new LuxuryThingsDao();

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(connectToDB());

	/*
	 * @Autowired private IType iType;
	 * 
	 * @Autowired private IPersonInfo iPersonInfo;
	 * 
	 * @Autowired private ISubjectFamily iSubjectFamily;
	 * 
	 * @Autowired private IRealuty iRealuty;
	 * 
	 * @Autowired private IIncome iIncome;
	 * 
	 * @Autowired private IVechicles iVechicles;
	 * 
	 * @Autowired private IShares iShares;
	 * 
	 * @Autowired private ILuxuryThings iLuxuryThings;
	 */

	/**
	 * Connecting to DB on server<br>
	 * Neaded for JDBC Template
	 * 
	 * @return SimpleDriverDataSource
	 */
	private SimpleDriverDataSource connectToDB() {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		try {
			dataSource.setDriver(new Driver());
			dataSource.setUrl(
					"jdbc:mysql://sb-db01.softbistro.online/declaration?useUnicode=yes&characterEncoding=UTF-8");
			dataSource.setUsername("root");
			dataSource.setPassword("rotrotrot");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dataSource;
	}

	/**
	 * Write to database batch of declarations
	 * @param batchGetingDeclaration
	 * @param id
	 */
	public void writeToDB(List<Declaration> batchGetingDeclaration, Integer id) {

		System.out.println("Begin-----------------------");

		personId = id;

		List<Type> batchType = new ArrayList<>();
		List<PersonInfo> batchPersonInfo = new ArrayList<>();
		List<PersonFamily> batchFamilyInfo = new ArrayList<>();
		List<Realuty> batchRealuty = new ArrayList<>();
		List<ShortRights> batchRights = new ArrayList<>();
		List<Income> batchIncomeGifts = new ArrayList<>();
		List<Income> batchIncomeAssets = new ArrayList<>();
		List<Vechicles> batchVechicles = new ArrayList<>();
		List<Shares> batchSharesSecurities = new ArrayList<>();
		List<Shares> batchSharesCorporativeLaw = new ArrayList<>();
		List<Shares> batchSharesRecipientPay = new ArrayList<>();
		List<LuxuryThings> batchLuxuryThings = new ArrayList<>();

		for (Declaration declaration : batchGetingDeclaration) {
			System.out.println("------ " + declaration.getId());

			// step_0
			batchType.add(iType.getType(declaration, ++personId));

			// step_1
			batchPersonInfo.add(iPersonInfo.getPersonInfo(declaration, personId));

			// step_2
			batchFamilyInfo.addAll(batchFamilyInfo.size(), iSubjectFamily.getSubjectFamily(declaration, personId));

			// step_3
			batchRealuty.addAll(batchRealuty.size(), iRealuty.getRealuty(declaration, personId));
			batchRights.addAll(batchRights.size(), iRealuty.getRights());

			// step_11
			batchIncomeGifts.addAll(batchIncomeGifts.size(), iIncome.getIncomeGifts(declaration, personId));
			batchRights.addAll(batchRights.size(), iIncome.getRights());

			batchIncomeAssets.addAll(batchIncomeAssets.size(), iIncome.getIncomeCashAssets(declaration, personId));
			batchRights.addAll(batchRights.size(), iIncome.getRights());

			// step_6
			batchVechicles.addAll(batchVechicles.size(), iVechicles.getVechicles(declaration, personId));
			batchRights.addAll(batchRights.size(), iVechicles.getRights());

			// step_7
			batchSharesSecurities.addAll(batchSharesSecurities.size(), iShares.getSecurities(declaration, personId));
			batchRights.addAll(batchRights.size(), iShares.getRights());

			// step_8
			batchSharesCorporativeLaw.addAll(batchSharesCorporativeLaw.size(),
					iShares.getCorporateLaw(declaration, personId));
			batchRights.addAll(batchRights.size(), iShares.getRights());

			// step_9
			batchSharesRecipientPay.addAll(batchSharesRecipientPay.size(),
					iShares.getRepicientPay(declaration, personId));

			// step_5

			batchLuxuryThings.addAll(batchLuxuryThings.size(), iLuxuryThings.getLuxuryThings(declaration, personId));
			batchRights.addAll(batchRights.size(), iLuxuryThings.getRights());
		}

		SqlParameterSource[] typeBatch = SqlParameterSourceUtils.createBatch(batchType.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_TYPE, typeBatch);

		SqlParameterSource[] personInfoBatch = SqlParameterSourceUtils.createBatch(batchPersonInfo.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_TO_SUBJECT_INFO, personInfoBatch);

		SqlParameterSource[] familyInfoBatch = SqlParameterSourceUtils.createBatch(batchFamilyInfo.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_FAMILY_INFO, familyInfoBatch);

		SqlParameterSource[] realutyInfoBatch = SqlParameterSourceUtils.createBatch(batchRealuty.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_REALUTY, realutyInfoBatch);

		SqlParameterSource[] incomeBatchGifts = SqlParameterSourceUtils.createBatch(batchIncomeGifts.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_INCOME_GIFTS, incomeBatchGifts);

		SqlParameterSource[] incomeBatchAssets = SqlParameterSourceUtils.createBatch(batchIncomeAssets.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_INCOME_ASSETS, incomeBatchAssets);

		SqlParameterSource[] vechiclesBatch = SqlParameterSourceUtils.createBatch(batchVechicles.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_TO_VECHICLES, vechiclesBatch);

		SqlParameterSource[] luxuryThingsBatch = SqlParameterSourceUtils.createBatch(batchLuxuryThings.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_LUXURY_THINGS, luxuryThingsBatch);

		SqlParameterSource[] sharesSecuritiesBatch = SqlParameterSourceUtils
				.createBatch(batchSharesSecurities.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_SHARES_SECURITIES, sharesSecuritiesBatch);

		SqlParameterSource[] sharesCorporativeLawBatch = SqlParameterSourceUtils
				.createBatch(batchSharesCorporativeLaw.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_SHARES_CORPORATELAW, sharesCorporativeLawBatch);

		SqlParameterSource[] sharesRecipientPayBatch = SqlParameterSourceUtils
				.createBatch(batchSharesRecipientPay.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_SHARES_RECIPIENTPAY, sharesRecipientPayBatch);

		SqlParameterSource[] rightsInfoBatch = SqlParameterSourceUtils.createBatch(batchRights.toArray());
		namedParameterJdbcTemplate.batchUpdate(INSERT_INTO_RIGHTS, rightsInfoBatch);

		String statusForChange = "IN_PROGRESS";
		String statusWillBeChaged = "DONE";

		jdbcTemplate.update(SQL_UPDATE_VALUE_STATUS, statusWillBeChaged, statusForChange,
				batchGetingDeclaration.size());

		System.out.println("DONE-------------------------------------------");
	}

}