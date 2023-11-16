/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Target.University;

/**
 *
 * @author DAWOUD
 */
public class AinShams {
private Construction Optical;
private Construction ScienceL3;   
private Construction Arts;
private Construction Laws;
private Construction Computers;
private Construction Childhood;
private Construction Pharmacy;
private Construction Alson;

private Construction GuestHouse;
private Construction Hospital;
private Construction CommerceL3;
private Construction EngL3;
private Construction MedicalL3;
private Construction Palace;
private Construction Education;
private Construction SpecificEducation;

private Construction Girls;
private Construction Agriculture;
private Construction ScienceDevelopment;
private Construction OldManagement;
private Construction NewManagement;
private Construction Library;
private Construction Asnan;
private Construction Madina;
   

private Construction FoundarySwitch;
private Construction IPOQUE;
private Construction UAC;
private Construction Portal;
private Construction DNS;
private Construction MIS;
private Construction SymanticWebGateway;
private Construction Firewall;


private Construction TMGServer;
private Construction Yahoo;


public AinShams()
   {
   Init();
   }//end constructor

   
   public void Init(){
        setOptical(new Construction("Optical","172.16.15.254" , "building"));
        setScienceL3(new Construction("ScienceL3","172.16.23.254" , "Faculty"));
        setArts(new Construction("Arts","172.16.31.254" , "Faculty"));
        setLaws(new Construction("Laws","172.16.39.254" , "Faculty"));
        setComputers(new Construction("Computers","172.16.47.254" , "Faculty"));
        setChildhood(new Construction("Childhood","172.16.55.254" , "building"));
        setPharmacy(new Construction("Pharmacy","172.16.63.254" , "Faculty"));
        setAlson(new Construction("Alson","172.16.71.254" , "Faculty"));
        
        setGuestHouse(new Construction("GuestHouse","172.16.87.254" , "building"));
        setHospital(new Construction("Hospital","172.16.95.254" , "building"));
        setCommerceL3(new Construction("CommerceL3","172.16.103.254" , "Faculty"));
        setEngL3(new Construction("EngL3","172.16.111.254" , "Faculty"));
        setMedicalL3(new Construction("MedicalL3","172.16.119.254" , "Faculty"));
        setPalace(new Construction("Palace","172.16.127.254" , "building"));
        setEducation(new Construction("Education","172.16.135.254" , "building"));
        setSpecificEducation(new Construction("SpecificEducation","172.16.143.254" , "building"));
        
        setGirls(new Construction("Girls","172.16.151.254" , "Faculty"));
        setAgriculture(new Construction("Agriculture","172.16.79.254" , "Faculty"));
        setScienceDevelopment(new Construction("ScienceDevelopment","172.16.159.254" , "building"));
        setOldManagement(new Construction("OldManagement","172.16.175.254" , "building"));
        setNewManagement(new Construction("NewManagement","172.16.167.254" , "building"));
        setLibrary(new Construction("Library","172.16.199.254" , "building"));
        setAsnan(new Construction("Asnan","172.16.215.254" , "Faculty"));
        setMadina(new Construction("Madina","172.16.207.254" , "building"));
        
        
        setFoundarySwitch(new Construction("FoundarySwitch","172.16.7.254" , "Network"));
        setIPOQUE(new Construction("IPOQUE","172.16.183.251" , "Network"));
        setUAC(new Construction("UAC","172.16.6.150" , "Network"));
        setSymanticWebGateway(new Construction("SymanticWebGateway","172.16.0.7" , "Network"));
        setFirewall(new Construction("Firewall","172.16.0.2" , "Network"));
        setPortal(new Construction("Portal","192.168.1.22" , "Network"));
        setDNS(new Construction("DNS","172.16.7.34" , "Network"));
        setMIS(new Construction("MIS","192.168.2.2" , "building"));
       
        setTMGServer(new Construction("TMGServer","172.16.167.167" , "building"));
        setYahoo(new Construction("Yahoo","87.248.122.122" , "Network"));
   }

    /**
     * @return the Optical
     */
    public Construction getOptical() {
        return Optical;
    }

    /**
     * @param Optical the Optical to set
     */
    public void setOptical(Construction Optical) {
        this.Optical = Optical;
    }

    /**
     * @return the ScienceL3
     */
    public Construction getScienceL3() {
        return ScienceL3;
    }

    /**
     * @param ScienceL3 the ScienceL3 to set
     */
    public void setScienceL3(Construction ScienceL3) {
        this.ScienceL3 = ScienceL3;
    }

    /**
     * @return the Arts
     */
    public Construction getArts() {
        return Arts;
    }

    /**
     * @param Arts the Arts to set
     */
    public void setArts(Construction Arts) {
        this.Arts = Arts;
    }

    /**
     * @return the Laws
     */
    public Construction getLaws() {
        return Laws;
    }

    /**
     * @param Laws the Laws to set
     */
    public void setLaws(Construction Laws) {
        this.Laws = Laws;
    }

    /**
     * @return the Computers
     */
    public Construction getComputers() {
        return Computers;
    }

    /**
     * @param Computers the Computers to set
     */
    public void setComputers(Construction Computers) {
        this.Computers = Computers;
    }

    /**
     * @return the Childhood
     */
    public Construction getChildhood() {
        return Childhood;
    }

    /**
     * @param Childhood the Childhood to set
     */
    public void setChildhood(Construction Childhood) {
        this.Childhood = Childhood;
    }

    /**
     * @return the Pharmacy
     */
    public Construction getPharmacy() {
        return Pharmacy;
    }

    /**
     * @param Pharmacy the Pharmacy to set
     */
    public void setPharmacy(Construction Pharmacy) {
        this.Pharmacy = Pharmacy;
    }

    /**
     * @return the Alson
     */
    public Construction getAlson() {
        return Alson;
    }

    /**
     * @param Alson the Alson to set
     */
    public void setAlson(Construction Alson) {
        this.Alson = Alson;
    }

    /**
     * @return the GuestHouse
     */
    public Construction getGuestHouse() {
        return GuestHouse;
    }

    /**
     * @param GuestHouse the GuestHouse to set
     */
    public void setGuestHouse(Construction GuestHouse) {
        this.GuestHouse = GuestHouse;
    }

    /**
     * @return the Hospital
     */
    public Construction getHospital() {
        return Hospital;
    }

    /**
     * @param Hospital the Hospital to set
     */
    public void setHospital(Construction Hospital) {
        this.Hospital = Hospital;
    }

    /**
     * @return the CommerceL3
     */
    public Construction getCommerceL3() {
        return CommerceL3;
    }

    /**
     * @param CommerceL3 the CommerceL3 to set
     */
    public void setCommerceL3(Construction CommerceL3) {
        this.CommerceL3 = CommerceL3;
    }

    /**
     * @return the EngL3
     */
    public Construction getEngL3() {
        return EngL3;
    }

    /**
     * @param EngL3 the EngL3 to set
     */
    public void setEngL3(Construction EngL3) {
        this.EngL3 = EngL3;
    }

    /**
     * @return the MedicalL3
     */
    public Construction getMedicalL3() {
        return MedicalL3;
    }

    /**
     * @param MedicalL3 the MedicalL3 to set
     */
    public void setMedicalL3(Construction MedicalL3) {
        this.MedicalL3 = MedicalL3;
    }

    /**
     * @return the Palace
     */
    public Construction getPalace() {
        return Palace;
    }

    /**
     * @param Palace the Palace to set
     */
    public void setPalace(Construction Palace) {
        this.Palace = Palace;
    }

    /**
     * @return the Education
     */
    public Construction getEducation() {
        return Education;
    }

    /**
     * @param Education the Education to set
     */
    public void setEducation(Construction Education) {
        this.Education = Education;
    }

    /**
     * @return the SpecificEducation
     */
    public Construction getSpecificEducation() {
        return SpecificEducation;
    }

    /**
     * @param SpecificEducation the SpecificEducation to set
     */
    public void setSpecificEducation(Construction SpecificEducation) {
        this.SpecificEducation = SpecificEducation;
    }

    /**
     * @return the Girls
     */
    public Construction getGirls() {
        return Girls;
    }

    /**
     * @param Girls the Girls to set
     */
    public void setGirls(Construction Girls) {
        this.Girls = Girls;
    }

    /**
     * @return the Agriculture
     */
    public Construction getAgriculture() {
        return Agriculture;
    }

    /**
     * @param Agriculture the Agriculture to set
     */
    public void setAgriculture(Construction Agriculture) {
        this.Agriculture = Agriculture;
    }

    /**
     * @return the ScienceDevelopment
     */
    public Construction getScienceDevelopment() {
        return ScienceDevelopment;
    }

    /**
     * @param ScienceDevelopment the ScienceDevelopment to set
     */
    public void setScienceDevelopment(Construction ScienceDevelopment) {
        this.ScienceDevelopment = ScienceDevelopment;
    }

    /**
     * @return the OldManagement
     */
    public Construction getOldManagement() {
        return OldManagement;
    }

    /**
     * @param OldManagement the OldManagement to set
     */
    public void setOldManagement(Construction OldManagement) {
        this.OldManagement = OldManagement;
    }

    /**
     * @return the NewManagement
     */
    public Construction getNewManagement() {
        return NewManagement;
    }

    /**
     * @param NewManagement the NewManagement to set
     */
    public void setNewManagement(Construction NewManagement) {
        this.NewManagement = NewManagement;
    }

    /**
     * @return the Library
     */
    public Construction getLibrary() {
        return Library;
    }

    /**
     * @param Library the Library to set
     */
    public void setLibrary(Construction Library) {
        this.Library = Library;
    }

    /**
     * @return the Asnan
     */
    public Construction getAsnan() {
        return Asnan;
    }

    /**
     * @param Asnan the Asnan to set
     */
    public void setAsnan(Construction Asnan) {
        this.Asnan = Asnan;
    }

    /**
     * @return the Madina
     */
    public Construction getMadina() {
        return Madina;
    }

    /**
     * @param Madina the Madina to set
     */
    public void setMadina(Construction Madina) {
        this.Madina = Madina;
    }

    /**
     * @return the FoundarySwitch
     */
    public Construction getFoundarySwitch() {
        return FoundarySwitch;
    }

    /**
     * @param FoundarySwitch the FoundarySwitch to set
     */
    public void setFoundarySwitch(Construction FoundarySwitch) {
        this.FoundarySwitch = FoundarySwitch;
    }

    /**
     * @return the IPOQUE
     */
    public Construction getIPOQUE() {
        return IPOQUE;
    }

    /**
     * @param IPOQUE the IPOQUE to set
     */
    public void setIPOQUE(Construction IPOQUE) {
        this.IPOQUE = IPOQUE;
    }

    /**
     * @return the UAC
     */
    public Construction getUAC() {
        return UAC;
    }

    /**
     * @param UAC the UAC to set
     */
    public void setUAC(Construction UAC) {
        this.UAC = UAC;
    }

    /**
     * @return the Portal
     */
    public Construction getPortal() {
        return Portal;
    }

    /**
     * @param Portal the Portal to set
     */
    public void setPortal(Construction Portal) {
        this.Portal = Portal;
    }

    /**
     * @return the DNS
     */
    public Construction getDNS() {
        return DNS;
    }

    /**
     * @param DNS the DNS to set
     */
    public void setDNS(Construction DNS) {
        this.DNS = DNS;
    }

    /**
     * @return the MIS
     */
    public Construction getMIS() {
        return MIS;
    }

    /**
     * @param MIS the MIS to set
     */
    public void setMIS(Construction MIS) {
        this.MIS = MIS;
    }

    /**
     * @return the SymanticWebGateway
     */
    public Construction getSymanticWebGateway() {
        return SymanticWebGateway;
    }

    /**
     * @param SymanticWebGateway the SymanticWebGateway to set
     */
    public void setSymanticWebGateway(Construction SymanticWebGateway) {
        this.SymanticWebGateway = SymanticWebGateway;
    }

    /**
     * @return the Firewall
     */
    public Construction getFirewall() {
        return Firewall;
    }

    /**
     * @param Firewall the Firewall to set
     */
    public void setFirewall(Construction Firewall) {
        this.Firewall = Firewall;
    }

    /**
     * @return the TMGServer
     */
    public Construction getTMGServer() {
        return TMGServer;
    }

    /**
     * @param TMGServer the TMGServer to set
     */
    public void setTMGServer(Construction TMGServer) {
        this.TMGServer = TMGServer;
    }

    /**
     * @return the Yahoo
     */
    public Construction getYahoo() {
        return Yahoo;
    }

    /**
     * @param Yahoo the Yahoo to set
     */
    public void setYahoo(Construction Yahoo) {
        this.Yahoo = Yahoo;
    }
   
}
