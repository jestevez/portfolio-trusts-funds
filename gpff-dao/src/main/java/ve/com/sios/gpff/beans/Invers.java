/*
 * Invers.java
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
package ve.com.sios.gpff.beans;

import java.io.Serializable;

/**
 * The Class Invers.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 23/03/2014
 */
public class Invers implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5226796846206905489L;

    /** The rowid. */
    private Long rowid;

    /** The invemp. */
    private String invemp;

    /** The invdel. */
    private String invdel;

    /** The invcli. */
    private Long invcli;

    /** The invval. */
    private String invval;

    /** The invint. */
    private Long invint;

    /** The invcla. */
    private String invcla;

    /** The invven. */
    private String invven;

    /** The invine. */
    private Long invine;

    /** The invvte. */
    private Long invvte;

    /** The invpre. */
    private Double invpre;

    /** The invini. */
    private Long invini;

    /** The invina. */
    private Long invina;

    /** The invvto. */
    private Long invvto;

    /** The invvta. */
    private Long invvta;

    /** The invefi. */
    private Double invefi;

    /** The inveff. */
    private Double inveff;

    /** The invprc. */
    private Double invprc;

    /** The inv 036. */
    private String inv036;

    /** The invtit. */
    private Double invtit;

    /** The invpme. */
    private Double invpme;

    /** The invpin. */
    private Double invpin;

    /** The invinf. */
    private Double invinf;

    /** The invrde. */
    private String invrde;

    /** The invlis. */
    private String invlis;

    /** The invanu. */
    private String invanu;

    /** The invsir. */
    private String invsir;

    /** The invico. */
    private Double invico;

    /** The invnop. */
    private Long invnop;

    /** The invper. */
    private Integer invper;

    /** The invfde. */
    private Double invfde;

    /** The invfui. */
    private Long invfui;

    /** The invnti. */
    private Long invnti;

    /** The invapr. */
    private Double invapr;

    /** The invibs. */
    private String invibs;

    /** The invigc. */
    private Double invigc;

    /** The invagd. */
    private Double invagd;

    /** The invbvi. */
    private Long invbvi;

    /** The invmar. */
    private Double invmar;

    /** The invta 1. */
    private String invta1;

    /** The invta 2. */
    private Double invta2;

    /** The invian. */
    private Double invian;

    /** The invbol. */
    private String invbol;

    /** The invipp. */
    private String invipp;

    /** The invvfv. */
    private String invvfv;

    /** The invpro. */
    private Integer invpro;

    /** The invpen. */
    private Double invpen;

    /** The invprx. */
    private Double invprx;

    /** The invvac. */
    private String invvac;

    /** The invnuc. */
    private Long invnuc;

    /** The invpop. */
    private Double invpop;

    /** The invbad. */
    private Integer invbad;

    /** The invvno. */
    private Double invvno;

    /** The invliq. */
    private Long invliq;

    /** The invres. */
    private Double invres;

    /** The invtim. */
    private Double invtim;

    /**
     * Instantiates a new invers.
     */
    public Invers() {
        super();
        this.invemp = null;
        this.invdel = null;
        this.invcli = null;
        this.invval = null;
        this.invint = null;
        this.invcla = null;
        this.invven = null;
        this.invine = null;
        this.invvte = null;
        this.invpre = null;
        this.invini = null;
        this.invina = null;
        this.invvto = null;
        this.invvta = null;
        this.invefi = null;
        this.inveff = null;
        this.invprc = null;
        this.inv036 = null;
        this.invtit = null;
        this.invpme = null;
        this.invpin = null;
        this.invinf = null;
        this.invrde = null;
        this.invlis = null;
        this.invanu = null;
        this.invsir = null;
        this.invico = null;
        this.invnop = null;
        this.invper = null;
        this.invfde = null;
        this.invfui = null;
        this.invnti = null;
        this.invapr = null;
        this.invibs = null;
        this.invigc = null;
        this.invagd = null;
        this.invbvi = null;
        this.invmar = null;
        this.invta1 = null;
        this.invta2 = null;
        this.invian = null;
        this.invbol = null;
        this.invipp = null;
        this.invvfv = null;
        this.invpro = null;
        this.invpen = null;
        this.invprx = null;
        this.invvac = null;
        this.invnuc = null;
        this.invpop = null;
        this.invbad = null;
        this.invvno = null;
        this.invliq = null;
        this.invres = null;
        this.invtim = null;

    }

    /**
     * Gets the rowid.
     *
     * @return the rowid
     */
    public Long getRowid() {
        return rowid;
    }

    /**
     * Sets the rowid.
     *
     * @param rowid the new rowid
     */
    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    /**
     * Gets the invemp.
     *
     * @return the invemp
     */
    public String getInvemp() {
        return invemp;
    }

    /**
     * Sets the invemp.
     *
     * @param invemp the new invemp
     */
    public void setInvemp(String invemp) {
        this.invemp = invemp;
    }

    /**
     * Gets the invdel.
     *
     * @return the invdel
     */
    public String getInvdel() {
        return invdel;
    }

    /**
     * Sets the invdel.
     *
     * @param invdel the new invdel
     */
    public void setInvdel(String invdel) {
        this.invdel = invdel;
    }

    /**
     * Gets the invcli.
     *
     * @return the invcli
     */
    public Long getInvcli() {
        return invcli;
    }

    /**
     * Sets the invcli.
     *
     * @param invcli the new invcli
     */
    public void setInvcli(Long invcli) {
        this.invcli = invcli;
    }

    /**
     * Gets the invval.
     *
     * @return the invval
     */
    public String getInvval() {
        return invval;
    }

    /**
     * Sets the invval.
     *
     * @param invval the new invval
     */
    public void setInvval(String invval) {
        this.invval = invval;
    }

    /**
     * Gets the invint.
     *
     * @return the invint
     */
    public Long getInvint() {
        return invint;
    }

    /**
     * Sets the invint.
     *
     * @param invint the new invint
     */
    public void setInvint(Long invint) {
        this.invint = invint;
    }

    /**
     * Gets the invcla.
     *
     * @return the invcla
     */
    public String getInvcla() {
        return invcla;
    }

    /**
     * Sets the invcla.
     *
     * @param invcla the new invcla
     */
    public void setInvcla(String invcla) {
        this.invcla = invcla;
    }

    /**
     * Gets the invven.
     *
     * @return the invven
     */
    public String getInvven() {
        return invven;
    }

    /**
     * Sets the invven.
     *
     * @param invven the new invven
     */
    public void setInvven(String invven) {
        this.invven = invven;
    }

    /**
     * Gets the invine.
     *
     * @return the invine
     */
    public Long getInvine() {
        return invine;
    }

    /**
     * Sets the invine.
     *
     * @param invine the new invine
     */
    public void setInvine(Long invine) {
        this.invine = invine;
    }

    /**
     * Gets the invvte.
     *
     * @return the invvte
     */
    public Long getInvvte() {
        return invvte;
    }

    /**
     * Sets the invvte.
     *
     * @param invvte the new invvte
     */
    public void setInvvte(Long invvte) {
        this.invvte = invvte;
    }

    /**
     * Gets the invpre.
     *
     * @return the invpre
     */
    public Double getInvpre() {
        return invpre;
    }

    /**
     * Sets the invpre.
     *
     * @param invpre the new invpre
     */
    public void setInvpre(Double invpre) {
        this.invpre = invpre;
    }

    /**
     * Gets the invini.
     *
     * @return the invini
     */
    public Long getInvini() {
        return invini;
    }

    /**
     * Sets the invini.
     *
     * @param invini the new invini
     */
    public void setInvini(Long invini) {
        this.invini = invini;
    }

    /**
     * Gets the invina.
     *
     * @return the invina
     */
    public Long getInvina() {
        return invina;
    }

    /**
     * Sets the invina.
     *
     * @param invina the new invina
     */
    public void setInvina(Long invina) {
        this.invina = invina;
    }

    /**
     * Gets the invvto.
     *
     * @return the invvto
     */
    public Long getInvvto() {
        return invvto;
    }

    /**
     * Sets the invvto.
     *
     * @param invvto the new invvto
     */
    public void setInvvto(Long invvto) {
        this.invvto = invvto;
    }

    /**
     * Gets the invvta.
     *
     * @return the invvta
     */
    public Long getInvvta() {
        return invvta;
    }

    /**
     * Sets the invvta.
     *
     * @param invvta the new invvta
     */
    public void setInvvta(Long invvta) {
        this.invvta = invvta;
    }

    /**
     * Gets the invefi.
     *
     * @return the invefi
     */
    public Double getInvefi() {
        return invefi;
    }

    /**
     * Sets the invefi.
     *
     * @param invefi the new invefi
     */
    public void setInvefi(Double invefi) {
        this.invefi = invefi;
    }

    /**
     * Gets the inveff.
     *
     * @return the inveff
     */
    public Double getInveff() {
        return inveff;
    }

    /**
     * Sets the inveff.
     *
     * @param inveff the new inveff
     */
    public void setInveff(Double inveff) {
        this.inveff = inveff;
    }

    /**
     * Gets the invprc.
     *
     * @return the invprc
     */
    public Double getInvprc() {
        return invprc;
    }

    /**
     * Sets the invprc.
     *
     * @param invprc the new invprc
     */
    public void setInvprc(Double invprc) {
        this.invprc = invprc;
    }

    /**
     * Gets the inv 036.
     *
     * @return the inv 036
     */
    public String getInv036() {
        return inv036;
    }

    /**
     * Sets the inv 036.
     *
     * @param inv036 the new inv 036
     */
    public void setInv036(String inv036) {
        this.inv036 = inv036;
    }

    /**
     * Gets the invtit.
     *
     * @return the invtit
     */
    public Double getInvtit() {
        return invtit;
    }

    /**
     * Sets the invtit.
     *
     * @param invtit the new invtit
     */
    public void setInvtit(Double invtit) {
        this.invtit = invtit;
    }

    /**
     * Gets the invpme.
     *
     * @return the invpme
     */
    public Double getInvpme() {
        return invpme;
    }

    /**
     * Sets the invpme.
     *
     * @param invpme the new invpme
     */
    public void setInvpme(Double invpme) {
        this.invpme = invpme;
    }

    /**
     * Gets the invpin.
     *
     * @return the invpin
     */
    public Double getInvpin() {
        return invpin;
    }

    /**
     * Sets the invpin.
     *
     * @param invpin the new invpin
     */
    public void setInvpin(Double invpin) {
        this.invpin = invpin;
    }

    /**
     * Gets the invinf.
     *
     * @return the invinf
     */
    public Double getInvinf() {
        return invinf;
    }

    /**
     * Sets the invinf.
     *
     * @param invinf the new invinf
     */
    public void setInvinf(Double invinf) {
        this.invinf = invinf;
    }

    /**
     * Gets the invrde.
     *
     * @return the invrde
     */
    public String getInvrde() {
        return invrde;
    }

    /**
     * Sets the invrde.
     *
     * @param invrde the new invrde
     */
    public void setInvrde(String invrde) {
        this.invrde = invrde;
    }

    /**
     * Gets the invlis.
     *
     * @return the invlis
     */
    public String getInvlis() {
        return invlis;
    }

    /**
     * Sets the invlis.
     *
     * @param invlis the new invlis
     */
    public void setInvlis(String invlis) {
        this.invlis = invlis;
    }

    /**
     * Gets the invanu.
     *
     * @return the invanu
     */
    public String getInvanu() {
        return invanu;
    }

    /**
     * Sets the invanu.
     *
     * @param invanu the new invanu
     */
    public void setInvanu(String invanu) {
        this.invanu = invanu;
    }

    /**
     * Gets the invsir.
     *
     * @return the invsir
     */
    public String getInvsir() {
        return invsir;
    }

    /**
     * Sets the invsir.
     *
     * @param invsir the new invsir
     */
    public void setInvsir(String invsir) {
        this.invsir = invsir;
    }

    /**
     * Gets the invico.
     *
     * @return the invico
     */
    public Double getInvico() {
        return invico;
    }

    /**
     * Sets the invico.
     *
     * @param invico the new invico
     */
    public void setInvico(Double invico) {
        this.invico = invico;
    }

    /**
     * Gets the invnop.
     *
     * @return the invnop
     */
    public Long getInvnop() {
        return invnop;
    }

    /**
     * Sets the invnop.
     *
     * @param invnop the new invnop
     */
    public void setInvnop(Long invnop) {
        this.invnop = invnop;
    }

    /**
     * Gets the invper.
     *
     * @return the invper
     */
    public Integer getInvper() {
        return invper;
    }

    /**
     * Sets the invper.
     *
     * @param invper the new invper
     */
    public void setInvper(Integer invper) {
        this.invper = invper;
    }

    /**
     * Gets the invfde.
     *
     * @return the invfde
     */
    public Double getInvfde() {
        return invfde;
    }

    /**
     * Sets the invfde.
     *
     * @param invfde the new invfde
     */
    public void setInvfde(Double invfde) {
        this.invfde = invfde;
    }

    /**
     * Gets the invfui.
     *
     * @return the invfui
     */
    public Long getInvfui() {
        return invfui;
    }

    /**
     * Sets the invfui.
     *
     * @param invfui the new invfui
     */
    public void setInvfui(Long invfui) {
        this.invfui = invfui;
    }

    /**
     * Gets the invnti.
     *
     * @return the invnti
     */
    public Long getInvnti() {
        return invnti;
    }

    /**
     * Sets the invnti.
     *
     * @param invnti the new invnti
     */
    public void setInvnti(Long invnti) {
        this.invnti = invnti;
    }

    /**
     * Gets the invapr.
     *
     * @return the invapr
     */
    public Double getInvapr() {
        return invapr;
    }

    /**
     * Sets the invapr.
     *
     * @param invapr the new invapr
     */
    public void setInvapr(Double invapr) {
        this.invapr = invapr;
    }

    /**
     * Gets the invibs.
     *
     * @return the invibs
     */
    public String getInvibs() {
        return invibs;
    }

    /**
     * Sets the invibs.
     *
     * @param invibs the new invibs
     */
    public void setInvibs(String invibs) {
        this.invibs = invibs;
    }

    /**
     * Gets the invigc.
     *
     * @return the invigc
     */
    public Double getInvigc() {
        return invigc;
    }

    /**
     * Sets the invigc.
     *
     * @param invigc the new invigc
     */
    public void setInvigc(Double invigc) {
        this.invigc = invigc;
    }

    /**
     * Gets the invagd.
     *
     * @return the invagd
     */
    public Double getInvagd() {
        return invagd;
    }

    /**
     * Sets the invagd.
     *
     * @param invagd the new invagd
     */
    public void setInvagd(Double invagd) {
        this.invagd = invagd;
    }

    /**
     * Gets the invbvi.
     *
     * @return the invbvi
     */
    public Long getInvbvi() {
        return invbvi;
    }

    /**
     * Sets the invbvi.
     *
     * @param invbvi the new invbvi
     */
    public void setInvbvi(Long invbvi) {
        this.invbvi = invbvi;
    }

    /**
     * Gets the invmar.
     *
     * @return the invmar
     */
    public Double getInvmar() {
        return invmar;
    }

    /**
     * Sets the invmar.
     *
     * @param invmar the new invmar
     */
    public void setInvmar(Double invmar) {
        this.invmar = invmar;
    }

    /**
     * Gets the invta 1.
     *
     * @return the invta 1
     */
    public String getInvta1() {
        return invta1;
    }

    /**
     * Sets the invta 1.
     *
     * @param invta1 the new invta 1
     */
    public void setInvta1(String invta1) {
        this.invta1 = invta1;
    }

    /**
     * Gets the invta 2.
     *
     * @return the invta 2
     */
    public Double getInvta2() {
        return invta2;
    }

    /**
     * Sets the invta 2.
     *
     * @param invta2 the new invta 2
     */
    public void setInvta2(Double invta2) {
        this.invta2 = invta2;
    }

    /**
     * Gets the invian.
     *
     * @return the invian
     */
    public Double getInvian() {
        return invian;
    }

    /**
     * Sets the invian.
     *
     * @param invian the new invian
     */
    public void setInvian(Double invian) {
        this.invian = invian;
    }

    /**
     * Gets the invbol.
     *
     * @return the invbol
     */
    public String getInvbol() {
        return invbol;
    }

    /**
     * Sets the invbol.
     *
     * @param invbol the new invbol
     */
    public void setInvbol(String invbol) {
        this.invbol = invbol;
    }

    /**
     * Gets the invipp.
     *
     * @return the invipp
     */
    public String getInvipp() {
        return invipp;
    }

    /**
     * Sets the invipp.
     *
     * @param invipp the new invipp
     */
    public void setInvipp(String invipp) {
        this.invipp = invipp;
    }

    /**
     * Gets the invvfv.
     *
     * @return the invvfv
     */
    public String getInvvfv() {
        return invvfv;
    }

    /**
     * Sets the invvfv.
     *
     * @param invvfv the new invvfv
     */
    public void setInvvfv(String invvfv) {
        this.invvfv = invvfv;
    }

    /**
     * Gets the invpro.
     *
     * @return the invpro
     */
    public Integer getInvpro() {
        return invpro;
    }

    /**
     * Sets the invpro.
     *
     * @param invpro the new invpro
     */
    public void setInvpro(Integer invpro) {
        this.invpro = invpro;
    }

    /**
     * Gets the invpen.
     *
     * @return the invpen
     */
    public Double getInvpen() {
        return invpen;
    }

    /**
     * Sets the invpen.
     *
     * @param invpen the new invpen
     */
    public void setInvpen(Double invpen) {
        this.invpen = invpen;
    }

    /**
     * Gets the invprx.
     *
     * @return the invprx
     */
    public Double getInvprx() {
        return invprx;
    }

    /**
     * Sets the invprx.
     *
     * @param invprx the new invprx
     */
    public void setInvprx(Double invprx) {
        this.invprx = invprx;
    }

    /**
     * Gets the invvac.
     *
     * @return the invvac
     */
    public String getInvvac() {
        return invvac;
    }

    /**
     * Sets the invvac.
     *
     * @param invvac the new invvac
     */
    public void setInvvac(String invvac) {
        this.invvac = invvac;
    }

    /**
     * Gets the invnuc.
     *
     * @return the invnuc
     */
    public Long getInvnuc() {
        return invnuc;
    }

    /**
     * Sets the invnuc.
     *
     * @param invnuc the new invnuc
     */
    public void setInvnuc(Long invnuc) {
        this.invnuc = invnuc;
    }

    /**
     * Gets the invpop.
     *
     * @return the invpop
     */
    public Double getInvpop() {
        return invpop;
    }

    /**
     * Sets the invpop.
     *
     * @param invpop the new invpop
     */
    public void setInvpop(Double invpop) {
        this.invpop = invpop;
    }

    /**
     * Gets the invbad.
     *
     * @return the invbad
     */
    public Integer getInvbad() {
        return invbad;
    }

    /**
     * Sets the invbad.
     *
     * @param invbad the new invbad
     */
    public void setInvbad(Integer invbad) {
        this.invbad = invbad;
    }

    /**
     * Gets the invvno.
     *
     * @return the invvno
     */
    public Double getInvvno() {
        return invvno;
    }

    /**
     * Sets the invvno.
     *
     * @param invvno the new invvno
     */
    public void setInvvno(Double invvno) {
        this.invvno = invvno;
    }

    /**
     * Gets the invliq.
     *
     * @return the invliq
     */
    public Long getInvliq() {
        return invliq;
    }

    /**
     * Sets the invliq.
     *
     * @param invliq the new invliq
     */
    public void setInvliq(Long invliq) {
        this.invliq = invliq;
    }

    /**
     * Gets the invres.
     *
     * @return the invres
     */
    public Double getInvres() {
        return invres;
    }

    /**
     * Sets the invres.
     *
     * @param invres the new invres
     */
    public void setInvres(Double invres) {
        this.invres = invres;
    }

    /**
     * Gets the invtim.
     *
     * @return the invtim
     */
    public Double getInvtim() {
        return invtim;
    }

    /**
     * Sets the invtim.
     *
     * @param invtim the new invtim
     */
    public void setInvtim(Double invtim) {
        this.invtim = invtim;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[55];
        array[0] = this.invemp;
        array[1] = this.invdel;
        array[2] = this.invcli;
        array[3] = this.invval;
        array[4] = this.invint;
        array[5] = this.invcla;
        array[6] = this.invven;
        array[7] = this.invine;
        array[8] = this.invvte;
        array[9] = this.invpre;
        array[10] = this.invini;
        array[11] = this.invina;
        array[12] = this.invvto;
        array[13] = this.invvta;
        array[14] = this.invefi;
        array[15] = this.inveff;
        array[16] = this.invprc;
        array[17] = this.inv036;
        array[18] = this.invtit;
        array[19] = this.invpme;
        array[20] = this.invpin;
        array[21] = this.invinf;
        array[22] = this.invrde;
        array[23] = this.invlis;
        array[24] = this.invanu;
        array[25] = this.invsir;
        array[26] = this.invico;
        array[27] = this.invnop;
        array[28] = this.invper;
        array[29] = this.invfde;
        array[30] = this.invfui;
        array[31] = this.invnti;
        array[32] = this.invapr;
        array[33] = this.invibs;
        array[34] = this.invigc;
        array[35] = this.invagd;
        array[36] = this.invbvi;
        array[37] = this.invmar;
        array[38] = this.invta1;
        array[39] = this.invta2;
        array[40] = this.invian;
        array[41] = this.invbol;
        array[42] = this.invipp;
        array[43] = this.invvfv;
        array[44] = this.invpro;
        array[45] = this.invpen;
        array[46] = this.invprx;
        array[47] = this.invvac;
        array[48] = this.invnuc;
        array[49] = this.invpop;
        array[50] = this.invbad;
        array[51] = this.invvno;
        array[52] = this.invliq;
        array[53] = this.invres;
        array[54] = this.invtim;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[55];
        array[0] = "invemp";
        array[1] = "invdel";
        array[2] = "invcli";
        array[3] = "invval";
        array[4] = "invint";
        array[5] = "invcla";
        array[6] = "invven";
        array[7] = "invine";
        array[8] = "invvte";
        array[9] = "invpre";
        array[10] = "invini";
        array[11] = "invina";
        array[12] = "invvto";
        array[13] = "invvta";
        array[14] = "invefi";
        array[15] = "inveff";
        array[16] = "invprc";
        array[17] = "inv036";
        array[18] = "invtit";
        array[19] = "invpme";
        array[20] = "invpin";
        array[21] = "invinf";
        array[22] = "invrde";
        array[23] = "invlis";
        array[24] = "invanu";
        array[25] = "invsir";
        array[26] = "invico";
        array[27] = "invnop";
        array[28] = "invper";
        array[29] = "invfde";
        array[30] = "invfui";
        array[31] = "invnti";
        array[32] = "invapr";
        array[33] = "invibs";
        array[34] = "invigc";
        array[35] = "invagd";
        array[36] = "invbvi";
        array[37] = "invmar";
        array[38] = "invta1";
        array[39] = "invta2";
        array[40] = "invian";
        array[41] = "invbol";
        array[42] = "invipp";
        array[43] = "invvfv";
        array[44] = "invpro";
        array[45] = "invpen";
        array[46] = "invprx";
        array[47] = "invvac";
        array[48] = "invnuc";
        array[49] = "invpop";
        array[50] = "invbad";
        array[51] = "invvno";
        array[52] = "invliq";
        array[53] = "invres";
        array[54] = "invtim";

        return array;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String string = "";
        string += "invemp: " + this.invemp + "\n";
        string += "invdel: " + this.invdel + "\n";
        string += "invcli: " + this.invcli + "\n";
        string += "invval: " + this.invval + "\n";
        string += "invint: " + this.invint + "\n";
        string += "invcla: " + this.invcla + "\n";
        string += "invven: " + this.invven + "\n";
        string += "invine: " + this.invine + "\n";
        string += "invvte: " + this.invvte + "\n";
        string += "invpre: " + this.invpre + "\n";
        string += "invini: " + this.invini + "\n";
        string += "invina: " + this.invina + "\n";
        string += "invvto: " + this.invvto + "\n";
        string += "invvta: " + this.invvta + "\n";
        string += "invefi: " + this.invefi + "\n";
        string += "inveff: " + this.inveff + "\n";
        string += "invprc: " + this.invprc + "\n";
        string += "inv036: " + this.inv036 + "\n";
        string += "invtit: " + this.invtit + "\n";
        string += "invpme: " + this.invpme + "\n";
        string += "invpin: " + this.invpin + "\n";
        string += "invinf: " + this.invinf + "\n";
        string += "invrde: " + this.invrde + "\n";
        string += "invlis: " + this.invlis + "\n";
        string += "invanu: " + this.invanu + "\n";
        string += "invsir: " + this.invsir + "\n";
        string += "invico: " + this.invico + "\n";
        string += "invnop: " + this.invnop + "\n";
        string += "invper: " + this.invper + "\n";
        string += "invfde: " + this.invfde + "\n";
        string += "invfui: " + this.invfui + "\n";
        string += "invnti: " + this.invnti + "\n";
        string += "invapr: " + this.invapr + "\n";
        string += "invibs: " + this.invibs + "\n";
        string += "invigc: " + this.invigc + "\n";
        string += "invagd: " + this.invagd + "\n";
        string += "invbvi: " + this.invbvi + "\n";
        string += "invmar: " + this.invmar + "\n";
        string += "invta1: " + this.invta1 + "\n";
        string += "invta2: " + this.invta2 + "\n";
        string += "invian: " + this.invian + "\n";
        string += "invbol: " + this.invbol + "\n";
        string += "invipp: " + this.invipp + "\n";
        string += "invvfv: " + this.invvfv + "\n";
        string += "invpro: " + this.invpro + "\n";
        string += "invpen: " + this.invpen + "\n";
        string += "invprx: " + this.invprx + "\n";
        string += "invvac: " + this.invvac + "\n";
        string += "invnuc: " + this.invnuc + "\n";
        string += "invpop: " + this.invpop + "\n";
        string += "invbad: " + this.invbad + "\n";
        string += "invvno: " + this.invvno + "\n";
        string += "invliq: " + this.invliq + "\n";
        string += "invres: " + this.invres + "\n";
        string += "invtim: " + this.invtim + "\n";

        return string;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        Object[] array = toArray();
        for (Object object : array) {
            result = prime * result + ((object == null) ? 0 : object.hashCode());
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Invers other = (Invers) obj;
        return this.hashCode() == other.hashCode();
    }

}
