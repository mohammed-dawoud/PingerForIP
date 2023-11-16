/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PingerForIP;

import com.sun.jmx.snmp.tasks.TaskServer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marwan
 */
public class ThreadManager {

       
       CreatePingTasks Tasks;
       SinglePingTask SingleTask;
       
       Thread OpticalThread;
       Thread ScienceL3Thread;
       Thread ArtsThread; 
       Thread LawsThread;
       Thread ComputersThread;
       Thread ChildhoodThread;
       Thread PharmacyThread;
       Thread AlsonThread;
               
       
       Thread GuestHouseThread;
       Thread HospitalThread;
       Thread CommerceL3Thread;
       Thread EngL3Thread;
       Thread MedicalL3Thread;
       Thread PalaceThread;
       Thread EducationThread;
       Thread SpecificEducationThread;
       
       Thread GirlsThread;
       Thread AgricultureThread;
       Thread ScienceDevelopmentThread;
       Thread OldManagementThread;
       Thread NewManagementThread;
       Thread LibraryThread;
       Thread AsnanThread;
       Thread MadinaThread;
       
       
       
       Thread FoundarySwitchThread;
       Thread IPOQUEThread;
       Thread UACThread;
       Thread PortalThread;
       Thread DNSThread;
       Thread MISThread;
       Thread SymanticWebGatewayThread;
       Thread FirewallThread;
       
       
       Thread TMGServerThread;
       Thread YahooThread;
       
       
       
       Thread SingleThread;
    
    
    
    public ThreadManager() 
    {
        
         Tasks=new CreatePingTasks();
         CreateAndInitializeThreads();
    }// end ThreadManager Constructor
    
    public void CreateAndInitializeThreads()
    {
        
        
        OpticalThread=new Thread(Tasks.getPingOptical());
        ScienceL3Thread=new Thread(Tasks.getPingScienceL3());
        ArtsThread=new Thread(Tasks.getPingArts());
        LawsThread=new Thread(Tasks.getPingLaws());
        ComputersThread=new Thread(Tasks.getPingComputers());
        ChildhoodThread=new Thread(Tasks.getPingChildhood());
        PharmacyThread=new Thread(Tasks.getPingPharmacy());
        AlsonThread=new Thread(Tasks.getPingAlson());
        
        GuestHouseThread=new Thread(Tasks.getPingGuestHouse());
        HospitalThread=new Thread(Tasks.getPingHospital());
        CommerceL3Thread=new Thread(Tasks.getPingCommerceL3());
        EngL3Thread=new Thread(Tasks.getPingEngL3());
        MedicalL3Thread=new Thread(Tasks.getPingMedicalL3());
        PalaceThread=new Thread(Tasks.getPingPalace());    
        EducationThread=new Thread(Tasks.getPingEducation());
        SpecificEducationThread=new Thread(Tasks.getPingSpecificEducation());
                
        GirlsThread=new Thread(Tasks.getPingGirls());
        AgricultureThread=new Thread(Tasks.getPingAgriculture());
        ScienceDevelopmentThread=new Thread(Tasks.getPingScienceDevelopment());
        OldManagementThread=new Thread(Tasks.getPingOldManagement());
        NewManagementThread=new Thread(Tasks.getPingNewManagement());
        LibraryThread=new Thread(Tasks.getPingLibrary());
        AsnanThread=new Thread(Tasks.getPingAsnan());
        MadinaThread=new Thread(Tasks.getPingMadina());
                
        
        FoundarySwitchThread=new Thread(Tasks.getPingFoundarySwitch());
        IPOQUEThread=new Thread(Tasks.getPingIPOQUE());
        UACThread=new Thread(Tasks.getPingUAC());
        PortalThread=new Thread(Tasks.getPingPortal());
        DNSThread=new Thread(Tasks.getPingDNS());
        MISThread=new Thread(Tasks.getPingMIS());
        SymanticWebGatewayThread=new Thread(Tasks.getPingSymanticWebGateway());
        FirewallThread=new Thread(Tasks.getPingFirewall());
        
        
        
        TMGServerThread=new Thread(Tasks.getPingTMGServer());
        YahooThread=new Thread(Tasks.getPingYahoo());
        
        
}// end CreateAndInitialize 
 
 // end StartThread   
 public void StartThreads()
 {
        OpticalThread.start();
             
        ScienceL3Thread.start();
        ArtsThread.start(); 
        LawsThread.start();
        ComputersThread.start();
        ChildhoodThread.start();
        PharmacyThread.start();
        AlsonThread.start();
               
       
        GuestHouseThread.start();
        HospitalThread.start();
        CommerceL3Thread.start();
        EngL3Thread.start();
        MedicalL3Thread.start();
        PalaceThread.start();
        EducationThread.start();
        SpecificEducationThread.start();
       
        GirlsThread.start();
        AgricultureThread.start();
        ScienceDevelopmentThread.start();
        OldManagementThread.start();
        NewManagementThread.start();
        LibraryThread.start();
        AsnanThread.start();
        MadinaThread.start();

        
        FoundarySwitchThread.start();
        IPOQUEThread.start();
        UACThread.start();
        PortalThread.start();
        DNSThread.start();
        MISThread.start();
        SymanticWebGatewayThread.start();
        FirewallThread.start();
        
        
        
        TMGServerThread.start();
        YahooThread.start();
        
     
 }// end StartThreads           
            
 // Start StartSingleThread
 public void StartSingleThread()
 {
     CreateSingleThread();
     SingleThread.start();
 }// end StartSingleThread
 // End StartSingleThread
 
 
 public void CreateSingleThread()
 {
     String IP=JOptionPane.showInputDialog("Please Write The Target IP Address and Click Ok", "Please Enter IP Address");
     String Name="Target";
     SingleTask=new SinglePingTask(Name, IP);
//     JFrame SingleIPFrame=new JFrame("Single IP Ping Window");
//     SingleIPFrame.setVisible(true);
//     SingleIPFrame.setSize(400, 400);
     SingleThread =new Thread(SingleTask.getSinglePing());
 } //end CreateSingleThread
 
 // End CreateSingleThread
// end StopThread   
 public void StopThreads()
 {
     Tasks.getPingOptical().StopThread();
     Tasks.getPingScienceL3().StopThread();
     Tasks.getPingArts().StopThread();
     Tasks.getPingLaws().StopThread();
     Tasks.getPingComputers().StopThread();
     Tasks.getPingChildhood().StopThread();
     Tasks.getPingPharmacy().StopThread();
     Tasks.getPingAlson().StopThread();
     
     Tasks.getPingGuestHouse().StopThread();
     Tasks.getPingHospital().StopThread();
     Tasks.getPingCommerceL3().StopThread();
     Tasks.getPingEngL3().StopThread();
     Tasks.getPingMedicalL3().StopThread();
     Tasks.getPingPalace().StopThread();
     Tasks.getPingEducation().StopThread();
     Tasks.getPingSpecificEducation().StopThread();
     
     Tasks.getPingGirls().StopThread();
     Tasks.getPingAgriculture().StopThread();
     Tasks.getPingScienceDevelopment().StopThread();
     Tasks.getPingOldManagement().StopThread();
     Tasks.getPingNewManagement().StopThread();
     Tasks.getPingLibrary().StopThread();
     Tasks.getPingAsnan().StopThread();
     Tasks.getPingMadina().StopThread();
     
     Tasks.getPingFoundarySwitch().StopThread();
     Tasks.getPingIPOQUE().StopThread();
     Tasks.getPingUAC().StopThread();
     Tasks.getPingPortal().StopThread();
     Tasks.getPingDNS().StopThread();
     Tasks.getPingMIS().StopThread();
     Tasks.getPingSymanticWebGateway().StopThread();
     Tasks.getPingFirewall().StopThread();
     
     Tasks.getPingTMGServer().StopThread();
     Tasks.getPingYahoo().StopThread();
     
     
     
     
//        OpticalThread.start();
//             
//        ScienceL3Thread.start();
//        ArtsThread.start(); 
//        LawsThread.start();
//        ComputersThread.start();
//        ChildhoodThread.start();
//        PharmacyThread.start();
//        AlsonThread.start();
//               
//       
//        GuestHouseThread.start();
//        HospitalThread.start();
//        CommerceL3Thread.start();
//        EngL3Thread.start();
//        MedicalL3Thread.start();
//        PalaceThread.start();
//        EducationThread.start();
//        SpecificEducationThread.start();
//       
//        GirlsThread.start();
//        AgricultureThread.start();
//        ScienceDevelopmentThread.start();
//        OldManagementThread.start();
//        NewManagementThread.start();
//        LibraryThread.start();
//        AsnanThread.start();
//        MadinaThread.start();
     
     
 }// end StopThreads            
            
            
            
}// end ThreadManager Class
