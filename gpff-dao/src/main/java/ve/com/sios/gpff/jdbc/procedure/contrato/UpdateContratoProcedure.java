/*
 * UpdateContratoProcedure.java
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

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Contrato;

/**
 * The Class UpdateContratoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/03/2014
 */
@Service
public class UpdateContratoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateContrato";

    /**
     * Instantiates a new update contrato procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateContratoProcedure(DataSource dataSource) {
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

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param contrato the contrato
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Contrato contrato, AuthorizationData authorizationData) throws GpffDaoException {

        if (contrato == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

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

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
