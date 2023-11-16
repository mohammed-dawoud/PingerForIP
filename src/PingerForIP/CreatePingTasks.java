/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PingerForIP;

import Target.University.AinShams;

/**
 *
 * @author Marwan
 */
public class CreatePingTasks {
    
    
       private AinShams Shams;
    
    
    
    
       private PingTaskRunnable PingOptical;
       private PingTaskRunnable PingScienceL3;
       private PingTaskRunnable PingArts; 
       private PingTaskRunnable PingLaws;
       private PingTaskRunnable PingComputers;
       private PingTaskRunnable PingChildhood;
       private PingTaskRunnable PingPharmacy;
       private PingTaskRunnable PingAlson;
               
       
       private PingTaskRunnable PingGuestHouse;
       private PingTaskRunnable PingHospital;
       private PingTaskRunnable PingCommerceL3;
       private PingTaskRunnable PingEngL3;
       private PingTaskRunnable PingMedicalL3;
       private PingTaskRunnable PingPalace;
       private PingTaskRunnable PingEducation;
       private PingTaskRunnable PingSpecificEducation;
       
       private PingTaskRunnable PingGirls;
       private PingTaskRunnable PingAgriculture;
       private PingTaskRunnable PingScienceDevelopment;
       private PingTaskRunnable PingOldManagement;
       private PingTaskRunnable PingNewManagement;
       private PingTaskRunnable PingLibrary;
       private PingTaskRunnable PingAsnan;
       private PingTaskRunnable PingMadina;
   
       
       private PingTaskRunnable PingFoundarySwitch;
       private PingTaskRunnable PingIPOQUE;
       private PingTaskRunnable PingUAC;
       private PingTaskRunnable PingSymanticWebGateway;
       private PingTaskRunnable PingFirewall;
       private PingTaskRunnable PingPortal;
       private PingTaskRunnable PingDNS;
       private PingTaskRunnable PingMIS;
       
       
       
       private PingTaskRunnable PingTMGServer;
       private PingTaskRunnable PingYahoo;
       
       public CreatePingTasks()
    {
        Shams= new AinShams();
        IntializePingTasks();
    }//end createpingTasks constructor
    
    
    
    public void IntializePingTasks()
{
                setPingOptical(new PingTaskRunnable(Shams.getOptical().GetName(), Shams.getOptical().GetIPAddress()));
                setPingScienceL3(new PingTaskRunnable(Shams.getScienceL3().GetName(), Shams.getScienceL3().GetIPAddress()));
                setPingArts(new PingTaskRunnable(Shams.getArts().GetName(), Shams.getArts().GetIPAddress()));
                setPingLaws(new PingTaskRunnable(Shams.getLaws().GetName(), Shams.getLaws().GetIPAddress()));
                setPingComputers(new PingTaskRunnable(Shams.getComputers().GetName(), Shams.getComputers().GetIPAddress()));
                setPingChildhood(new PingTaskRunnable(Shams.getChildhood().GetName(), Shams.getChildhood().GetIPAddress()));
                setPingPharmacy(new PingTaskRunnable(Shams.getPharmacy().GetName(), Shams.getPharmacy().GetIPAddress()));
                setPingAlson(new PingTaskRunnable(Shams.getAlson().GetName(), Shams.getAlson().GetIPAddress()));
                
                setPingGuestHouse(new PingTaskRunnable(Shams.getGuestHouse().GetName(), Shams.getGuestHouse().GetIPAddress()));
                setPingHospital(new PingTaskRunnable(Shams.getHospital().GetName(), Shams.getHospital().GetIPAddress()));
                setPingCommerceL3(new PingTaskRunnable(Shams.getCommerceL3().GetName(), Shams.getCommerceL3().GetIPAddress()));
                setPingEngL3(new PingTaskRunnable(Shams.getEngL3().GetName(), Shams.getEngL3().GetIPAddress()));
                setPingMedicalL3(new PingTaskRunnable(Shams.getMedicalL3().GetName(), Shams.getMedicalL3().GetIPAddress()));
                setPingPalace(new PingTaskRunnable(Shams.getPalace().GetName(), Shams.getPalace().GetIPAddress()));
                setPingEducation(new PingTaskRunnable(Shams.getEducation().GetName(), Shams.getEducation().GetIPAddress()));
                setPingSpecificEducation(new PingTaskRunnable(Shams.getSpecificEducation().GetName(), Shams.getSpecificEducation().GetIPAddress()));
                
                setPingGirls(new PingTaskRunnable(Shams.getGirls().GetName(), Shams.getGirls().GetIPAddress()));
                setPingAgriculture(new PingTaskRunnable(Shams.getAgriculture().GetName(), Shams.getAgriculture().GetIPAddress()));
                setPingScienceDevelopment(new PingTaskRunnable(Shams.getScienceDevelopment().GetName(), Shams.getScienceDevelopment().GetIPAddress()));
                setPingOldManagement(new PingTaskRunnable(Shams.getOldManagement().GetName(), Shams.getOldManagement().GetIPAddress()));
                setPingNewManagement(new PingTaskRunnable(Shams.getNewManagement().GetName(), Shams.getNewManagement().GetIPAddress()));
                setPingLibrary(new PingTaskRunnable(Shams.getLibrary().GetName(), Shams.getLibrary().GetIPAddress()));
                setPingAsnan(new PingTaskRunnable(Shams.getAsnan().GetName(), Shams.getAsnan().GetIPAddress()));
                setPingMadina(new PingTaskRunnable(Shams.getMadina().GetName(), Shams.getMadina().GetIPAddress()));
                
                
                
                setPingFoundarySwitch(new PingTaskRunnable(Shams.getFoundarySwitch().GetName(), Shams.getFoundarySwitch().GetIPAddress()));
                setPingIPOQUE(new PingTaskRunnable(Shams.getIPOQUE().GetName(), Shams.getIPOQUE().GetIPAddress()));
                setPingUAC(new PingTaskRunnable(Shams.getUAC().GetName(), Shams.getUAC().GetIPAddress()));
                setPingSymanticWebGateway(new PingTaskRunnable(Shams.getSymanticWebGateway().GetName(), Shams.getSymanticWebGateway().GetIPAddress()));
                setPingFirewall(new PingTaskRunnable(Shams.getFirewall().GetName(), Shams.getFirewall().GetIPAddress()));
                setPingPortal(new PingTaskRunnable(Shams.getPortal().GetName(), Shams.getPortal().GetIPAddress()));
                setPingDNS(new PingTaskRunnable(Shams.getDNS().GetName(), Shams.getDNS().GetIPAddress()));
                setPingMIS(new PingTaskRunnable(Shams.getMIS().GetName(), Shams.getMIS().GetIPAddress()));
                
                
                setPingTMGServer(new PingTaskRunnable(Shams.getTMGServer().GetName(), Shams.getTMGServer().GetIPAddress()));
                setPingYahoo(new PingTaskRunnable(Shams.getYahoo().GetName(), Shams.getYahoo().GetIPAddress()));
                
}//end IntializePingTasks

    /**
     * @return the PingOptical
     */
    public PingTaskRunnable getPingOptical() {
        return PingOptical;
    }

    /**
     * @param PingOptical the PingOptical to set
     */
    public void setPingOptical(PingTaskRunnable PingOptical) {
        this.PingOptical = PingOptical;
    }

    /**
     * @return the PingScienceL3
     */
    public PingTaskRunnable getPingScienceL3() {
        return PingScienceL3;
    }

    /**
     * @param PingScienceL3 the PingScienceL3 to set
     */
    public void setPingScienceL3(PingTaskRunnable PingScienceL3) {
        this.PingScienceL3 = PingScienceL3;
    }

    /**
     * @return the PingArts
     */
    public PingTaskRunnable getPingArts() {
        return PingArts;
    }

    /**
     * @param PingArts the PingArts to set
     */
    public void setPingArts(PingTaskRunnable PingArts) {
        this.PingArts = PingArts;
    }

    /**
     * @return the PingLaws
     */
    public PingTaskRunnable getPingLaws() {
        return PingLaws;
    }

    /**
     * @param PingLaws the PingLaws to set
     */
    public void setPingLaws(PingTaskRunnable PingLaws) {
        this.PingLaws = PingLaws;
    }

    /**
     * @return the PingComputers
     */
    public PingTaskRunnable getPingComputers() {
        return PingComputers;
    }

    /**
     * @param PingComputers the PingComputers to set
     */
    public void setPingComputers(PingTaskRunnable PingComputers) {
        this.PingComputers = PingComputers;
    }

    /**
     * @return the PingChildhood
     */
    public PingTaskRunnable getPingChildhood() {
        return PingChildhood;
    }

    /**
     * @param PingChildhood the PingChildhood to set
     */
    public void setPingChildhood(PingTaskRunnable PingChildhood) {
        this.PingChildhood = PingChildhood;
    }

    /**
     * @return the PingPharmacy
     */
    public PingTaskRunnable getPingPharmacy() {
        return PingPharmacy;
    }

    /**
     * @param PingPharmacy the PingPharmacy to set
     */
    public void setPingPharmacy(PingTaskRunnable PingPharmacy) {
        this.PingPharmacy = PingPharmacy;
    }

    /**
     * @return the PingAlson
     */
    public PingTaskRunnable getPingAlson() {
        return PingAlson;
    }

    /**
     * @param PingAlson the PingAlson to set
     */
    public void setPingAlson(PingTaskRunnable PingAlson) {
        this.PingAlson = PingAlson;
    }

    /**
     * @return the PingGuestHouse
     */
    public PingTaskRunnable getPingGuestHouse() {
        return PingGuestHouse;
    }

    /**
     * @param PingGuestHouse the PingGuestHouse to set
     */
    public void setPingGuestHouse(PingTaskRunnable PingGuestHouse) {
        this.PingGuestHouse = PingGuestHouse;
    }

    /**
     * @return the PingHospital
     */
    public PingTaskRunnable getPingHospital() {
        return PingHospital;
    }

    /**
     * @param PingHospital the PingHospital to set
     */
    public void setPingHospital(PingTaskRunnable PingHospital) {
        this.PingHospital = PingHospital;
    }

    /**
     * @return the PingCommerceL3
     */
    public PingTaskRunnable getPingCommerceL3() {
        return PingCommerceL3;
    }

    /**
     * @param PingCommerceL3 the PingCommerceL3 to set
     */
    public void setPingCommerceL3(PingTaskRunnable PingCommerceL3) {
        this.PingCommerceL3 = PingCommerceL3;
    }

    /**
     * @return the PingEngL3
     */
    public PingTaskRunnable getPingEngL3() {
        return PingEngL3;
    }

    /**
     * @param PingEngL3 the PingEngL3 to set
     */
    public void setPingEngL3(PingTaskRunnable PingEngL3) {
        this.PingEngL3 = PingEngL3;
    }

    /**
     * @return the PingMedicalL3
     */
    public PingTaskRunnable getPingMedicalL3() {
        return PingMedicalL3;
    }

    /**
     * @param PingMedicalL3 the PingMedicalL3 to set
     */
    public void setPingMedicalL3(PingTaskRunnable PingMedicalL3) {
        this.PingMedicalL3 = PingMedicalL3;
    }

    /**
     * @return the PingPalace
     */
    public PingTaskRunnable getPingPalace() {
        return PingPalace;
    }

    /**
     * @param PingPalace the PingPalace to set
     */
    public void setPingPalace(PingTaskRunnable PingPalace) {
        this.PingPalace = PingPalace;
    }

    /**
     * @return the PingEducation
     */
    public PingTaskRunnable getPingEducation() {
        return PingEducation;
    }

    /**
     * @param PingEducation the PingEducation to set
     */
    public void setPingEducation(PingTaskRunnable PingEducation) {
        this.PingEducation = PingEducation;
    }

    /**
     * @return the PingSpecificEducation
     */
    public PingTaskRunnable getPingSpecificEducation() {
        return PingSpecificEducation;
    }

    /**
     * @param PingSpecificEducation the PingSpecificEducation to set
     */
    public void setPingSpecificEducation(PingTaskRunnable PingSpecificEducation) {
        this.PingSpecificEducation = PingSpecificEducation;
    }

    /**
     * @return the PingGirls
     */
    public PingTaskRunnable getPingGirls() {
        return PingGirls;
    }

    /**
     * @param PingGirls the PingGirls to set
     */
    public void setPingGirls(PingTaskRunnable PingGirls) {
        this.PingGirls = PingGirls;
    }

    /**
     * @return the PingAgriculture
     */
    public PingTaskRunnable getPingAgriculture() {
        return PingAgriculture;
    }

    /**
     * @param PingAgriculture the PingAgriculture to set
     */
    public void setPingAgriculture(PingTaskRunnable PingAgriculture) {
        this.PingAgriculture = PingAgriculture;
    }

    /**
     * @return the PingScienceDevelopment
     */
    public PingTaskRunnable getPingScienceDevelopment() {
        return PingScienceDevelopment;
    }

    /**
     * @param PingScienceDevelopment the PingScienceDevelopment to set
     */
    public void setPingScienceDevelopment(PingTaskRunnable PingScienceDevelopment) {
        this.PingScienceDevelopment = PingScienceDevelopment;
    }

    /**
     * @return the PingOldManagement
     */
    public PingTaskRunnable getPingOldManagement() {
        return PingOldManagement;
    }

    /**
     * @param PingOldManagement the PingOldManagement to set
     */
    public void setPingOldManagement(PingTaskRunnable PingOldManagement) {
        this.PingOldManagement = PingOldManagement;
    }

    /**
     * @return the PingNewManagement
     */
    public PingTaskRunnable getPingNewManagement() {
        return PingNewManagement;
    }

    /**
     * @param PingNewManagement the PingNewManagement to set
     */
    public void setPingNewManagement(PingTaskRunnable PingNewManagement) {
        this.PingNewManagement = PingNewManagement;
    }

    /**
     * @return the PingLibrary
     */
    public PingTaskRunnable getPingLibrary() {
        return PingLibrary;
    }

    /**
     * @param PingLibrary the PingLibrary to set
     */
    public void setPingLibrary(PingTaskRunnable PingLibrary) {
        this.PingLibrary = PingLibrary;
    }

    /**
     * @return the PingAsnan
     */
    public PingTaskRunnable getPingAsnan() {
        return PingAsnan;
    }

    /**
     * @param PingAsnan the PingAsnan to set
     */
    public void setPingAsnan(PingTaskRunnable PingAsnan) {
        this.PingAsnan = PingAsnan;
    }

    /**
     * @return the PingMadina
     */
    public PingTaskRunnable getPingMadina() {
        return PingMadina;
    }

    /**
     * @param PingMadina the PingMadina to set
     */
    public void setPingMadina(PingTaskRunnable PingMadina) {
        this.PingMadina = PingMadina;
    }

    /**
     * @return the PingFoundarySwitch
     */
    public PingTaskRunnable getPingFoundarySwitch() {
        return PingFoundarySwitch;
    }

    /**
     * @param PingFoundarySwitch the PingFoundarySwitch to set
     */
    public void setPingFoundarySwitch(PingTaskRunnable PingFoundarySwitch) {
        this.PingFoundarySwitch = PingFoundarySwitch;
    }

    /**
     * @return the PingIPOQUE
     */
    public PingTaskRunnable getPingIPOQUE() {
        return PingIPOQUE;
    }

    /**
     * @param PingIPOQUE the PingIPOQUE to set
     */
    public void setPingIPOQUE(PingTaskRunnable PingIPOQUE) {
        this.PingIPOQUE = PingIPOQUE;
    }

    /**
     * @return the PingUAC
     */
    public PingTaskRunnable getPingUAC() {
        return PingUAC;
    }

    /**
     * @param PingUAC the PingUAC to set
     */
    public void setPingUAC(PingTaskRunnable PingUAC) {
        this.PingUAC = PingUAC;
    }

    /**
     * @return the PingSymanticWebGateway
     */
    public PingTaskRunnable getPingSymanticWebGateway() {
        return PingSymanticWebGateway;
    }

    /**
     * @param PingSymanticWebGateway the PingSymanticWebGateway to set
     */
    public void setPingSymanticWebGateway(PingTaskRunnable PingSymanticWebGateway) {
        this.PingSymanticWebGateway = PingSymanticWebGateway;
    }

    /**
     * @return the PingFirewall
     */
    public PingTaskRunnable getPingFirewall() {
        return PingFirewall;
    }

    /**
     * @param PingFirewall the PingFirewall to set
     */
    public void setPingFirewall(PingTaskRunnable PingFirewall) {
        this.PingFirewall = PingFirewall;
    }

    /**
     * @return the PingPortal
     */
    public PingTaskRunnable getPingPortal() {
        return PingPortal;
    }

    /**
     * @param PingPortal the PingPortal to set
     */
    public void setPingPortal(PingTaskRunnable PingPortal) {
        this.PingPortal = PingPortal;
    }

    /**
     * @return the PingDNS
     */
    public PingTaskRunnable getPingDNS() {
        return PingDNS;
    }

    /**
     * @param PingDNS the PingDNS to set
     */
    public void setPingDNS(PingTaskRunnable PingDNS) {
        this.PingDNS = PingDNS;
    }

    /**
     * @return the PingMIS
     */
    public PingTaskRunnable getPingMIS() {
        return PingMIS;
    }

    /**
     * @param PingMIS the PingMIS to set
     */
    public void setPingMIS(PingTaskRunnable PingMIS) {
        this.PingMIS = PingMIS;
    }

    /**
     * @return the PingTMGServer
     */
    public PingTaskRunnable getPingTMGServer() {
        return PingTMGServer;
    }

    /**
     * @param PingTMGServer the PingTMGServer to set
     */
    public void setPingTMGServer(PingTaskRunnable PingTMGServer) {
        this.PingTMGServer = PingTMGServer;
    }

    /**
     * @return the PingYahoo
     */
    public PingTaskRunnable getPingYahoo() {
        return PingYahoo;
    }

    /**
     * @param PingYahoo the PingYahoo to set
     */
    public void setPingYahoo(PingTaskRunnable PingYahoo) {
        this.PingYahoo = PingYahoo;
    }
}//end createpingtasks class
