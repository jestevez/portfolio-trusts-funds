/*
 * ReadContratoProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
 *
 * http://www.sios.com.ve
 * http://www.indesoft.org.ve
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ve.com.sios.gpff.jdbc.procedure.contrato;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Contrato;

/**
 * The Class ReadContratoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/03/2014
 */
@Service
public class ReadContratoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadContrato";

    /**
     * Instantiates a new read contrato procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadContratoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CONEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTNFMT", Types.INTEGER));
        declareParameter(new SqlParameter("P_NUCONT", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLICLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATFID", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATGES", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATFOP", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATFVL", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATFEU", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATFEI", Types.BIGINT));
        declareParameter(new SqlParameter("P_FECVEN", Types.BIGINT));
        declareParameter(new SqlParameter("P_FECSYS", Types.BIGINT));
        declareParameter(new SqlParameter("P_DATPRM", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATMAX", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATINT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATMIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATMAE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATMNT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATMTA", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATGA1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATGA2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATGA3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATDE1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATDE2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATDE3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATDIC", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATDIS", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATMES", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATDIA", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATMEA", Types.INTEGER));
        declareParameter(new SqlParameter("P_DATPCC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DATREB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DATPER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTNUSO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTNANU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMPRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COSDIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_CONMNT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_MNTCO1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_NTAB", Types.INTEGER));
        declareParameter(new SqlParameter("P_FIJVAR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MNTCOM", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMFIJ", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMAPC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMAPF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMCCU", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RENOV", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FRMPA", Types.INTEGER));
        declareParameter(new SqlParameter("P_RP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NOMRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRORE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CERE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FOLRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FOLRE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TOMRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TOMRE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ASIRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ASIRE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OBJ1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OBJ2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OBJ3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OBJ4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OBJ5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FECPRO", Types.BIGINT));
        declareParameter(new SqlParameter("P_FECEJE", Types.BIGINT));
        declareParameter(new SqlParameter("P_AUTORI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PEAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDUL1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PEAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDUL2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PEAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDUL3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USUARI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_NUMCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SECCI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VIGEN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NUMOFI", Types.BIGINT));
        declareParameter(new SqlParameter("P_CANT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CANT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LINCO1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LINCO2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCION", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIAS", Types.INTEGER));
        declareParameter(new SqlParameter("P_DIA1", Types.INTEGER));
        declareParameter(new SqlParameter("P_LIN1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN7", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN8", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN9", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LI1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LI2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LI10", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LI11", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LI12", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN13", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LIN14", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FORPAG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INDIVI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONJUN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTEI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AHOI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CHEI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_REII", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTEP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AHOP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CHEP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_REIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTEI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NAHOI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTEP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NAHOP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MATDEP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECFIDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRFIDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POFIDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEFIDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NFIDE", Types.BIGINT));
        declareParameter(new SqlParameter("P_FID2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECFID2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRFID2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POFID2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEFID2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NFID2", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN1", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN2", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN3", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN4", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN5", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN5", Types.BIGINT));
        declareParameter(new SqlParameter("P_BENE6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECBEN6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRBEN6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBEN6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEBEN6", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBEN6", Types.BIGINT));
        declareParameter(new SqlParameter("P_NOMASE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIRASE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EDADVI", Types.INTEGER));
        declareParameter(new SqlParameter("P_HONORA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRCA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRCP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTOR1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEAUT1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTOR2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEAUT2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTOR3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PRAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEAUT3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NUMAPO", Types.INTEGER));
        declareParameter(new SqlParameter("P_CONFFI", Types.BIGINT));
        declareParameter(new SqlParameter("P_CONIMP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CONPRC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ENVIO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_GESCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_COMAPO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMRET", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMFIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_NFALI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NFALP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ICOAPO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ICORET", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ICOFIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CLICON", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new ContratoMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param contrato the contrato
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Contrato contrato, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (contrato == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", contrato.getRowid());
        inParams.put("P_CONEMP", contrato.getConemp());
        inParams.put("P_CONDEL", contrato.getCondel());
        inParams.put("P_CTNFMT", contrato.getCtnfmt());
        inParams.put("P_NUCONT", contrato.getNucont());
        inParams.put("P_CLICLA", contrato.getClicla());
        inParams.put("P_DATFID", contrato.getDatfid());
        inParams.put("P_DATGES", contrato.getDatges());
        inParams.put("P_DATFOP", contrato.getDatfop());
        inParams.put("P_DATFVL", contrato.getDatfvl());
        inParams.put("P_DATFEU", contrato.getDatfeu());
        inParams.put("P_DATFEI", contrato.getDatfei());
        inParams.put("P_FECVEN", contrato.getFecven());
        inParams.put("P_FECSYS", contrato.getFecsys());
        inParams.put("P_DATPRM", contrato.getDatprm());
        inParams.put("P_DATMAX", contrato.getDatmax());
        inParams.put("P_DATINT", contrato.getDatint());
        inParams.put("P_DATMIN", contrato.getDatmin());
        inParams.put("P_DATMAE", contrato.getDatmae());
        inParams.put("P_DATMNT", contrato.getDatmnt());
        inParams.put("P_DATMTA", contrato.getDatmta());
        inParams.put("P_DATGA1", contrato.getDatga1());
        inParams.put("P_DATGA2", contrato.getDatga2());
        inParams.put("P_DATGA3", contrato.getDatga3());
        inParams.put("P_DATDE1", contrato.getDatde1());
        inParams.put("P_DATDE2", contrato.getDatde2());
        inParams.put("P_DATDE3", contrato.getDatde3());
        inParams.put("P_DATDIC", contrato.getDatdic());
        inParams.put("P_DATDIS", contrato.getDatdis());
        inParams.put("P_DATMES", contrato.getDatmes());
        inParams.put("P_DATDIA", contrato.getDatdia());
        inParams.put("P_DATMEA", contrato.getDatmea());
        inParams.put("P_DATPCC", contrato.getDatpcc());
        inParams.put("P_DATREB", contrato.getDatreb());
        inParams.put("P_DATPER", contrato.getDatper());
        inParams.put("P_CTNUSO", contrato.getCtnuso());
        inParams.put("P_CTNANU", contrato.getCtnanu());
        inParams.put("P_EMPRE", contrato.getEmpre());
        inParams.put("P_CEEMP", contrato.getCeemp());
        inParams.put("P_COSDIV", contrato.getCosdiv());
        inParams.put("P_CONMNT", contrato.getConmnt());
        inParams.put("P_MNTCO1", contrato.getMntco1());
        inParams.put("P_NTAB", contrato.getNtab());
        inParams.put("P_FIJVAR", contrato.getFijvar());
        inParams.put("P_MNTCOM", contrato.getMntcom());
        inParams.put("P_COMFIJ", contrato.getComfij());
        inParams.put("P_COMAPC", contrato.getComapc());
        inParams.put("P_COMAPF", contrato.getComapf());
        inParams.put("P_COMCCU", contrato.getComccu());
        inParams.put("P_RENOV", contrato.getRenov());
        inParams.put("P_FRMPA", contrato.getFrmpa());
        inParams.put("P_RP", contrato.getRp());
        inParams.put("P_NOMRE", contrato.getNomre());
        inParams.put("P_CEDRE", contrato.getCedre());
        inParams.put("P_ECRE", contrato.getEcre());
        inParams.put("P_PRORE", contrato.getProre());
        inParams.put("P_POBRE", contrato.getPobre());
        inParams.put("P_CERE", contrato.getCere());
        inParams.put("P_FOLRE", contrato.getFolre());
        inParams.put("P_FOLRE1", contrato.getFolre1());
        inParams.put("P_TOMRE", contrato.getTomre());
        inParams.put("P_TOMRE1", contrato.getTomre1());
        inParams.put("P_ASIRE", contrato.getAsire());
        inParams.put("P_ASIRE1", contrato.getAsire1());
        inParams.put("P_OBJ1", contrato.getObj1());
        inParams.put("P_OBJ2", contrato.getObj2());
        inParams.put("P_OBJ3", contrato.getObj3());
        inParams.put("P_OBJ4", contrato.getObj4());
        inParams.put("P_OBJ5", contrato.getObj5());
        inParams.put("P_FECPRO", contrato.getFecpro());
        inParams.put("P_FECEJE", contrato.getFeceje());
        inParams.put("P_AUTORI", contrato.getAutori());
        inParams.put("P_PEAUT1", contrato.getPeaut1());
        inParams.put("P_COAUT1", contrato.getCoaut1());
        inParams.put("P_CEDUL1", contrato.getCedul1());
        inParams.put("P_PEAUT2", contrato.getPeaut2());
        inParams.put("P_COAUT2", contrato.getCoaut2());
        inParams.put("P_CEDUL2", contrato.getCedul2());
        inParams.put("P_PEAUT3", contrato.getPeaut3());
        inParams.put("P_COAUT3", contrato.getCoaut3());
        inParams.put("P_CEDUL3", contrato.getCedul3());
        inParams.put("P_USUARI", contrato.getUsuari());
        inParams.put("P_COMI", contrato.getComi());
        inParams.put("P_NUMCTA", contrato.getNumcta());
        inParams.put("P_SECCI", contrato.getSecci());
        inParams.put("P_VIGEN", contrato.getVigen());
        inParams.put("P_NUMOFI", contrato.getNumofi());
        inParams.put("P_CANT1", contrato.getCant1());
        inParams.put("P_CANT2", contrato.getCant2());
        inParams.put("P_LINCO1", contrato.getLinco1());
        inParams.put("P_LINCO2", contrato.getLinco2());
        inParams.put("P_OPCION", contrato.getOpcion());
        inParams.put("P_DIAS", contrato.getDias());
        inParams.put("P_DIA1", contrato.getDia1());
        inParams.put("P_LIN1", contrato.getLin1());
        inParams.put("P_LIN2", contrato.getLin2());
        inParams.put("P_LIN3", contrato.getLin3());
        inParams.put("P_LIN4", contrato.getLin4());
        inParams.put("P_LIN5", contrato.getLin5());
        inParams.put("P_LIN6", contrato.getLin6());
        inParams.put("P_LIN7", contrato.getLin7());
        inParams.put("P_LIN8", contrato.getLin8());
        inParams.put("P_LIN9", contrato.getLin9());
        inParams.put("P_LI1", contrato.getLi1());
        inParams.put("P_LI2", contrato.getLi2());
        inParams.put("P_LI10", contrato.getLi10());
        inParams.put("P_LI11", contrato.getLi11());
        inParams.put("P_LI12", contrato.getLi12());
        inParams.put("P_LIN13", contrato.getLin13());
        inParams.put("P_LIN14", contrato.getLin14());
        inParams.put("P_FORPAG", contrato.getForpag());
        inParams.put("P_INDIVI", contrato.getIndivi());
        inParams.put("P_CONJUN", contrato.getConjun());
        inParams.put("P_CTEI", contrato.getCtei());
        inParams.put("P_AHOI", contrato.getAhoi());
        inParams.put("P_CHEI", contrato.getChei());
        inParams.put("P_REII", contrato.getReii());
        inParams.put("P_CTEP", contrato.getCtep());
        inParams.put("P_AHOP", contrato.getAhop());
        inParams.put("P_CHEP", contrato.getChep());
        inParams.put("P_REIP", contrato.getReip());
        inParams.put("P_NCTEI", contrato.getNctei());
        inParams.put("P_NAHOI", contrato.getNahoi());
        inParams.put("P_NCTEP", contrato.getNctep());
        inParams.put("P_NAHOP", contrato.getNahop());
        inParams.put("P_MATDEP", contrato.getMatdep());
        inParams.put("P_FIDE", contrato.getFide());
        inParams.put("P_ECFIDE", contrato.getEcfide());
        inParams.put("P_PRFIDE", contrato.getPrfide());
        inParams.put("P_POFIDE", contrato.getPofide());
        inParams.put("P_CEFIDE", contrato.getCefide());
        inParams.put("P_NFIDE", contrato.getNfide());
        inParams.put("P_FID2", contrato.getFid2());
        inParams.put("P_ECFID2", contrato.getEcfid2());
        inParams.put("P_PRFID2", contrato.getPrfid2());
        inParams.put("P_POFID2", contrato.getPofid2());
        inParams.put("P_CEFID2", contrato.getCefid2());
        inParams.put("P_NFID2", contrato.getNfid2());
        inParams.put("P_BENE1", contrato.getBene1());
        inParams.put("P_ECBEN1", contrato.getEcben1());
        inParams.put("P_PRBEN1", contrato.getPrben1());
        inParams.put("P_POBEN1", contrato.getPoben1());
        inParams.put("P_CEBEN1", contrato.getCeben1());
        inParams.put("P_NBEN1", contrato.getNben1());
        inParams.put("P_BENE2", contrato.getBene2());
        inParams.put("P_ECBEN2", contrato.getEcben2());
        inParams.put("P_PRBEN2", contrato.getPrben2());
        inParams.put("P_POBEN2", contrato.getPoben2());
        inParams.put("P_CEBEN2", contrato.getCeben2());
        inParams.put("P_NBEN2", contrato.getNben2());
        inParams.put("P_BENE3", contrato.getBene3());
        inParams.put("P_ECBEN3", contrato.getEcben3());
        inParams.put("P_PRBEN3", contrato.getPrben3());
        inParams.put("P_POBEN3", contrato.getPoben3());
        inParams.put("P_CEBEN3", contrato.getCeben3());
        inParams.put("P_NBEN3", contrato.getNben3());
        inParams.put("P_BENE4", contrato.getBene4());
        inParams.put("P_ECBEN4", contrato.getEcben4());
        inParams.put("P_PRBEN4", contrato.getPrben4());
        inParams.put("P_POBEN4", contrato.getPoben4());
        inParams.put("P_CEBEN4", contrato.getCeben4());
        inParams.put("P_NBEN4", contrato.getNben4());
        inParams.put("P_BENE5", contrato.getBene5());
        inParams.put("P_ECBEN5", contrato.getEcben5());
        inParams.put("P_PRBEN5", contrato.getPrben5());
        inParams.put("P_POBEN5", contrato.getPoben5());
        inParams.put("P_CEBEN5", contrato.getCeben5());
        inParams.put("P_NBEN5", contrato.getNben5());
        inParams.put("P_BENE6", contrato.getBene6());
        inParams.put("P_ECBEN6", contrato.getEcben6());
        inParams.put("P_PRBEN6", contrato.getPrben6());
        inParams.put("P_POBEN6", contrato.getPoben6());
        inParams.put("P_CEBEN6", contrato.getCeben6());
        inParams.put("P_NBEN6", contrato.getNben6());
        inParams.put("P_NOMASE", contrato.getNomase());
        inParams.put("P_DIRASE", contrato.getDirase());
        inParams.put("P_EDADVI", contrato.getEdadvi());
        inParams.put("P_HONORA", contrato.getHonora());
        inParams.put("P_PRCA", contrato.getPrca());
        inParams.put("P_PRCP", contrato.getPrcp());
        inParams.put("P_AUTOR1", contrato.getAutor1());
        inParams.put("P_ECAUT1", contrato.getEcaut1());
        inParams.put("P_PRAUT1", contrato.getPraut1());
        inParams.put("P_POAUT1", contrato.getPoaut1());
        inParams.put("P_CEAUT1", contrato.getCeaut1());
        inParams.put("P_AUTOR2", contrato.getAutor2());
        inParams.put("P_ECAUT2", contrato.getEcaut2());
        inParams.put("P_PRAUT2", contrato.getPraut2());
        inParams.put("P_POAUT2", contrato.getPoaut2());
        inParams.put("P_CEAUT2", contrato.getCeaut2());
        inParams.put("P_AUTOR3", contrato.getAutor3());
        inParams.put("P_ECAUT3", contrato.getEcaut3());
        inParams.put("P_PRAUT3", contrato.getPraut3());
        inParams.put("P_POAUT3", contrato.getPoaut3());
        inParams.put("P_CEAUT3", contrato.getCeaut3());
        inParams.put("P_NUMAPO", contrato.getNumapo());
        inParams.put("P_CONFFI", contrato.getConffi());
        inParams.put("P_CONIMP", contrato.getConimp());
        inParams.put("P_CONPRC", contrato.getConprc());
        inParams.put("P_ENVIO", contrato.getEnvio());
        inParams.put("P_GESCOD", contrato.getGescod());
        inParams.put("P_COMAPO", contrato.getComapo());
        inParams.put("P_COMRET", contrato.getComret());
        inParams.put("P_COMFIN", contrato.getComfin());
        inParams.put("P_NFALI", contrato.getNfali());
        inParams.put("P_NFALP", contrato.getNfalp());
        inParams.put("P_ICOAPO", contrato.getIcoapo());
        inParams.put("P_ICORET", contrato.getIcoret());
        inParams.put("P_ICOFIN", contrato.getIcofin());
        inParams.put("P_CLICON", contrato.getClicon());

        inParams.put("P_FIRSTRESULT", firstResult);
        inParams.put("P_MAXRESULT", maxResults);
        inParams.put("P_SORT", sortClause);
        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);
            for (Iterator it = maps.entrySet().iterator(); it.hasNext();) {
                list = (List) ((Map.Entry) it.next()).getValue();
            }
            return list;
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}

class ContratoMapper implements RowMapper<Contrato> {

    public Contrato mapRow(ResultSet rs, int i) throws SQLException {
        Contrato contrato = new Contrato();
        contrato.setRowid(rs.getLong("ROWID"));
        contrato.setConemp(rs.getString("CONEMP"));
        contrato.setCondel(rs.getString("CONDEL"));
        contrato.setCtnfmt(rs.getInt("CTNFMT"));
        contrato.setNucont(rs.getLong("NUCONT"));
        contrato.setClicla(rs.getLong("CLICLA"));
        contrato.setDatfid(rs.getLong("DATFID"));
        contrato.setDatges(rs.getLong("DATGES"));
        contrato.setDatfop(rs.getLong("DATFOP"));
        contrato.setDatfvl(rs.getLong("DATFVL"));
        contrato.setDatfeu(rs.getLong("DATFEU"));
        contrato.setDatfei(rs.getLong("DATFEI"));
        contrato.setFecven(rs.getLong("FECVEN"));
        contrato.setFecsys(rs.getLong("FECSYS"));
        contrato.setDatprm(rs.getBigDecimal("DATPRM"));
        contrato.setDatmax(rs.getInt("DATMAX"));
        contrato.setDatint(rs.getBigDecimal("DATINT"));
        contrato.setDatmin(rs.getBigDecimal("DATMIN"));
        contrato.setDatmae(rs.getBigDecimal("DATMAE"));
        contrato.setDatmnt(rs.getBigDecimal("DATMNT"));
        contrato.setDatmta(rs.getBigDecimal("DATMTA"));
        contrato.setDatga1(rs.getBigDecimal("DATGA1"));
        contrato.setDatga2(rs.getBigDecimal("DATGA2"));
        contrato.setDatga3(rs.getBigDecimal("DATGA3"));
        contrato.setDatde1(rs.getBigDecimal("DATDE1"));
        contrato.setDatde2(rs.getBigDecimal("DATDE2"));
        contrato.setDatde3(rs.getBigDecimal("DATDE3"));
        contrato.setDatdic(rs.getInt("DATDIC"));
        contrato.setDatdis(rs.getInt("DATDIS"));
        contrato.setDatmes(rs.getInt("DATMES"));
        contrato.setDatdia(rs.getInt("DATDIA"));
        contrato.setDatmea(rs.getInt("DATMEA"));
        contrato.setDatpcc(rs.getBigDecimal("DATPCC"));
        contrato.setDatreb(rs.getString("DATREB"));
        contrato.setDatper(rs.getString("DATPER"));
        contrato.setCtnuso(rs.getString("CTNUSO"));
        contrato.setCtnanu(rs.getString("CTNANU"));
        contrato.setEmpre(rs.getString("EMPRE"));
        contrato.setCeemp(rs.getString("CEEMP"));
        contrato.setCosdiv(rs.getInt("COSDIV"));
        contrato.setConmnt(rs.getBigDecimal("CONMNT"));
        contrato.setMntco1(rs.getBigDecimal("MNTCO1"));
        contrato.setNtab(rs.getInt("NTAB"));
        contrato.setFijvar(rs.getString("FIJVAR"));
        contrato.setMntcom(rs.getBigDecimal("MNTCOM"));
        contrato.setComfij(rs.getBigDecimal("COMFIJ"));
        contrato.setComapc(rs.getBigDecimal("COMAPC"));
        contrato.setComapf(rs.getBigDecimal("COMAPF"));
        contrato.setComccu(rs.getBigDecimal("COMCCU"));
        contrato.setRenov(rs.getString("RENOV"));
        contrato.setFrmpa(rs.getInt("FRMPA"));
        contrato.setRp(rs.getString("RP"));
        contrato.setNomre(rs.getString("NOMRE"));
        contrato.setCedre(rs.getString("CEDRE"));
        contrato.setEcre(rs.getString("ECRE"));
        contrato.setProre(rs.getString("PRORE"));
        contrato.setPobre(rs.getString("POBRE"));
        contrato.setCere(rs.getString("CERE"));
        contrato.setFolre(rs.getString("FOLRE"));
        contrato.setFolre1(rs.getString("FOLRE1"));
        contrato.setTomre(rs.getString("TOMRE"));
        contrato.setTomre1(rs.getString("TOMRE1"));
        contrato.setAsire(rs.getString("ASIRE"));
        contrato.setAsire1(rs.getString("ASIRE1"));
        contrato.setObj1(rs.getString("OBJ1"));
        contrato.setObj2(rs.getString("OBJ2"));
        contrato.setObj3(rs.getString("OBJ3"));
        contrato.setObj4(rs.getString("OBJ4"));
        contrato.setObj5(rs.getString("OBJ5"));
        contrato.setFecpro(rs.getLong("FECPRO"));
        contrato.setFeceje(rs.getLong("FECEJE"));
        contrato.setAutori(rs.getString("AUTORI"));
        contrato.setPeaut1(rs.getString("PEAUT1"));
        contrato.setCoaut1(rs.getString("COAUT1"));
        contrato.setCedul1(rs.getString("CEDUL1"));
        contrato.setPeaut2(rs.getString("PEAUT2"));
        contrato.setCoaut2(rs.getString("COAUT2"));
        contrato.setCedul2(rs.getString("CEDUL2"));
        contrato.setPeaut3(rs.getString("PEAUT3"));
        contrato.setCoaut3(rs.getString("COAUT3"));
        contrato.setCedul3(rs.getString("CEDUL3"));
        contrato.setUsuari(rs.getString("USUARI"));
        contrato.setComi(rs.getBigDecimal("COMI"));
        contrato.setNumcta(rs.getString("NUMCTA"));
        contrato.setSecci(rs.getString("SECCI"));
        contrato.setVigen(rs.getString("VIGEN"));
        contrato.setNumofi(rs.getLong("NUMOFI"));
        contrato.setCant1(rs.getString("CANT1"));
        contrato.setCant2(rs.getString("CANT2"));
        contrato.setLinco1(rs.getString("LINCO1"));
        contrato.setLinco2(rs.getString("LINCO2"));
        contrato.setOpcion(rs.getString("OPCION"));
        contrato.setDias(rs.getInt("DIAS"));
        contrato.setDia1(rs.getInt("DIA1"));
        contrato.setLin1(rs.getString("LIN1"));
        contrato.setLin2(rs.getString("LIN2"));
        contrato.setLin3(rs.getString("LIN3"));
        contrato.setLin4(rs.getString("LIN4"));
        contrato.setLin5(rs.getString("LIN5"));
        contrato.setLin6(rs.getString("LIN6"));
        contrato.setLin7(rs.getString("LIN7"));
        contrato.setLin8(rs.getString("LIN8"));
        contrato.setLin9(rs.getString("LIN9"));
        contrato.setLi1(rs.getString("LI1"));
        contrato.setLi2(rs.getString("LI2"));
        contrato.setLi10(rs.getString("LI10"));
        contrato.setLi11(rs.getString("LI11"));
        contrato.setLi12(rs.getString("LI12"));
        contrato.setLin13(rs.getString("LIN13"));
        contrato.setLin14(rs.getString("LIN14"));
        contrato.setForpag(rs.getString("FORPAG"));
        contrato.setIndivi(rs.getString("INDIVI"));
        contrato.setConjun(rs.getString("CONJUN"));
        contrato.setCtei(rs.getString("CTEI"));
        contrato.setAhoi(rs.getString("AHOI"));
        contrato.setChei(rs.getString("CHEI"));
        contrato.setReii(rs.getString("REII"));
        contrato.setCtep(rs.getString("CTEP"));
        contrato.setAhop(rs.getString("AHOP"));
        contrato.setChep(rs.getString("CHEP"));
        contrato.setReip(rs.getString("REIP"));
        contrato.setNctei(rs.getString("NCTEI"));
        contrato.setNahoi(rs.getString("NAHOI"));
        contrato.setNctep(rs.getString("NCTEP"));
        contrato.setNahop(rs.getString("NAHOP"));
        contrato.setMatdep(rs.getString("MATDEP"));
        contrato.setFide(rs.getString("FIDE"));
        contrato.setEcfide(rs.getString("ECFIDE"));
        contrato.setPrfide(rs.getString("PRFIDE"));
        contrato.setPofide(rs.getString("POFIDE"));
        contrato.setCefide(rs.getString("CEFIDE"));
        contrato.setNfide(rs.getLong("NFIDE"));
        contrato.setFid2(rs.getString("FID2"));
        contrato.setEcfid2(rs.getString("ECFID2"));
        contrato.setPrfid2(rs.getString("PRFID2"));
        contrato.setPofid2(rs.getString("POFID2"));
        contrato.setCefid2(rs.getString("CEFID2"));
        contrato.setNfid2(rs.getLong("NFID2"));
        contrato.setBene1(rs.getString("BENE1"));
        contrato.setEcben1(rs.getString("ECBEN1"));
        contrato.setPrben1(rs.getString("PRBEN1"));
        contrato.setPoben1(rs.getString("POBEN1"));
        contrato.setCeben1(rs.getString("CEBEN1"));
        contrato.setNben1(rs.getLong("NBEN1"));
        contrato.setBene2(rs.getString("BENE2"));
        contrato.setEcben2(rs.getString("ECBEN2"));
        contrato.setPrben2(rs.getString("PRBEN2"));
        contrato.setPoben2(rs.getString("POBEN2"));
        contrato.setCeben2(rs.getString("CEBEN2"));
        contrato.setNben2(rs.getLong("NBEN2"));
        contrato.setBene3(rs.getString("BENE3"));
        contrato.setEcben3(rs.getString("ECBEN3"));
        contrato.setPrben3(rs.getString("PRBEN3"));
        contrato.setPoben3(rs.getString("POBEN3"));
        contrato.setCeben3(rs.getString("CEBEN3"));
        contrato.setNben3(rs.getLong("NBEN3"));
        contrato.setBene4(rs.getString("BENE4"));
        contrato.setEcben4(rs.getString("ECBEN4"));
        contrato.setPrben4(rs.getString("PRBEN4"));
        contrato.setPoben4(rs.getString("POBEN4"));
        contrato.setCeben4(rs.getString("CEBEN4"));
        contrato.setNben4(rs.getLong("NBEN4"));
        contrato.setBene5(rs.getString("BENE5"));
        contrato.setEcben5(rs.getString("ECBEN5"));
        contrato.setPrben5(rs.getString("PRBEN5"));
        contrato.setPoben5(rs.getString("POBEN5"));
        contrato.setCeben5(rs.getString("CEBEN5"));
        contrato.setNben5(rs.getLong("NBEN5"));
        contrato.setBene6(rs.getString("BENE6"));
        contrato.setEcben6(rs.getString("ECBEN6"));
        contrato.setPrben6(rs.getString("PRBEN6"));
        contrato.setPoben6(rs.getString("POBEN6"));
        contrato.setCeben6(rs.getString("CEBEN6"));
        contrato.setNben6(rs.getLong("NBEN6"));
        contrato.setNomase(rs.getString("NOMASE"));
        contrato.setDirase(rs.getString("DIRASE"));
        contrato.setEdadvi(rs.getInt("EDADVI"));
        contrato.setHonora(rs.getString("HONORA"));
        contrato.setPrca(rs.getString("PRCA"));
        contrato.setPrcp(rs.getString("PRCP"));
        contrato.setAutor1(rs.getString("AUTOR1"));
        contrato.setEcaut1(rs.getString("ECAUT1"));
        contrato.setPraut1(rs.getString("PRAUT1"));
        contrato.setPoaut1(rs.getString("POAUT1"));
        contrato.setCeaut1(rs.getString("CEAUT1"));
        contrato.setAutor2(rs.getString("AUTOR2"));
        contrato.setEcaut2(rs.getString("ECAUT2"));
        contrato.setPraut2(rs.getString("PRAUT2"));
        contrato.setPoaut2(rs.getString("POAUT2"));
        contrato.setCeaut2(rs.getString("CEAUT2"));
        contrato.setAutor3(rs.getString("AUTOR3"));
        contrato.setEcaut3(rs.getString("ECAUT3"));
        contrato.setPraut3(rs.getString("PRAUT3"));
        contrato.setPoaut3(rs.getString("POAUT3"));
        contrato.setCeaut3(rs.getString("CEAUT3"));
        contrato.setNumapo(rs.getInt("NUMAPO"));
        contrato.setConffi(rs.getLong("CONFFI"));
        contrato.setConimp(rs.getBigDecimal("CONIMP"));
        contrato.setConprc(rs.getBigDecimal("CONPRC"));
        contrato.setEnvio(rs.getString("ENVIO"));
        contrato.setGescod(rs.getInt("GESCOD"));
        contrato.setComapo(rs.getBigDecimal("COMAPO"));
        contrato.setComret(rs.getBigDecimal("COMRET"));
        contrato.setComfin(rs.getBigDecimal("COMFIN"));
        contrato.setNfali(rs.getString("NFALI"));
        contrato.setNfalp(rs.getString("NFALP"));
        contrato.setIcoapo(rs.getBigDecimal("ICOAPO"));
        contrato.setIcoret(rs.getBigDecimal("ICORET"));
        contrato.setIcofin(rs.getBigDecimal("ICOFIN"));
        contrato.setClicon(rs.getInt("CLICON"));

        return contrato;
    }
}
