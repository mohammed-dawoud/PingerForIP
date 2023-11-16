/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PingerForIP;

import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author DAWOUD
 */
public class PingTaskRunnable  implements Runnable{
    
   private  String Name;
   private  String IPAddress;
   private  String Type;
   private  String Address;
   private  boolean StopThread=false;
   private  boolean Status;
    public PingTaskRunnable(String Name,String IP)
    {   setIPAddress(IP);
        setName(Name);
    }
    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet.");
        while(!StopThread)
        {
            try   
            {  
                InetAddress ADDRESS =InetAddress.getByName(getIPAddress());  
                setStatus(ADDRESS.isReachable(6000));
                System.out.println(getName()+" is" + String.valueOf(isStatus()));
                UpdateTextFieldsStatus();
                
                
                
                
                
                Thread.sleep(50000);  
            } catch (UnknownHostException e4)   
            {  
                // TODO Auto-generated catch block  
                e4.printStackTrace();  
            } catch (IOException e4) {  
                // TODO Auto-generated catch block  
                e4.printStackTrace();  
            } 
            catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }//end while running
        
    }
    public boolean StopThread()
    {
        this.StopThread=true;
        return this.StopThread;
    }//end Stop

    
  // start AdjustFields  
    public void UpdateTextFieldsStatus()
    {
    
        switch(Name)
                {
                    case "Optical":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldOptical.setText("Reachable");
                        PingerForIPJFrame.jTextFieldOptical.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldOptical.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldOptical.setBackground(Color.red);
                        }
                        break;
                   
                        
                        
                  case "ScienceL3":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldScienceL3.setText("Reachable");
                        PingerForIPJFrame.jTextFieldScienceL3.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldScienceL3.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldScienceL3.setBackground(Color.red);
                        }
                        break;      
                   
                      
                  case "Arts":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldArts.setText("Reachable");
                        PingerForIPJFrame.jTextFieldArts.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldArts.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldArts.setBackground(Color.red);
                        }
                        break; 
                  
                  
                      
                 case "Laws":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldLaws.setText("Reachable");
                        PingerForIPJFrame.jTextFieldLaws.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldLaws.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldLaws.setBackground(Color.red);
                        }
                        break;     
                  
                     
                     
                     
                case "Computers":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldComputers.setText("Reachable");
                        PingerForIPJFrame.jTextFieldComputers.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldComputers.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldComputers.setBackground(Color.red);
                        }
                        break;     
                     
                    
                    
                case "Childhood":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldChildhood.setText("Reachable");
                        PingerForIPJFrame.jTextFieldChildhood.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldChildhood.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldChildhood.setBackground(Color.red);
                        }
                        break;    
                  
                    
                    
                    
                case "Pharmacy":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPharmacy.setText("Reachable");
                        PingerForIPJFrame.jTextFieldPharmacy.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPharmacy.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldPharmacy.setBackground(Color.red);
                        }
                        break; 
                    
                    
                    
                case "Alson":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAlson.setText("Reachable");
                        PingerForIPJFrame.jTextFieldAlson.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAlson.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldAlson.setBackground(Color.red);
                        }
                        break;     
                    
                
                    
               case "GuestHouse":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldGuestHouse.setText("Reachable");
                        PingerForIPJFrame.jTextFieldGuestHouse.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldGuestHouse.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldGuestHouse.setBackground(Color.red);
                        }
                        break;     
                    
                   
                   
               case "Hospital":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldHospital.setText("Reachable");
                        PingerForIPJFrame.jTextFieldHospital.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldHospital.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldHospital.setBackground(Color.red);
                        }
                        break;    
               
                   
                   
              case "CommerceL3":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldCommerceL3.setText("Reachable");
                        PingerForIPJFrame.jTextFieldCommerceL3.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldCommerceL3.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldCommerceL3.setBackground(Color.red);
                        }
                        break;
                  
                  
                  
                  case "EngL3":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldEngL3.setText("Reachable");
                        PingerForIPJFrame.jTextFieldEngL3.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldEngL3.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldEngL3.setBackground(Color.red);
                        }
                        break; 
                  
                      
                      
                  case "MedicalL3":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMedicalL3.setText("Reachable");
                        PingerForIPJFrame.jTextFieldMedicalL3.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMedicalL3.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldMedicalL3.setBackground(Color.red);
                        }
                        break; 
                       
                    
                      
                   case "Palace":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPalace.setText("Reachable");
                        PingerForIPJFrame.jTextFieldPalace.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPalace.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldPalace.setBackground(Color.red);
                        }
                        break; 
                  
                       
                       
                  case "Education":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldEducation.setText("Reachable");
                        PingerForIPJFrame.jTextFieldEducation.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldEducation.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldEducation.setBackground(Color.red);
                        }
                        break;
                      
                      
                      
                  case "SpecificEducation":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldSpecificEducation.setText("Reachable");
                        PingerForIPJFrame.jTextFieldSpecificEducation.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldSpecificEducation.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldSpecificEducation.setBackground(Color.red);
                        }
                        break; 
                          
                  case "Girls":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldGirls.setText("Reachable");
                        PingerForIPJFrame.jTextFieldGirls.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldGirls.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldGirls.setBackground(Color.red);
                        }
                        break;
                      
                      
                      
                      
                  case "Agriculture":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAgriculture.setText("Reachable");
                        PingerForIPJFrame.jTextFieldAgriculture.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAgriculture.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldAgriculture.setBackground(Color.red);
                        }
                        break;  
                      
                      
                  case "ScienceDevelopment":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldScienceDevelopment.setText("Reachable");
                        PingerForIPJFrame.jTextFieldScienceDevelopment.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldScienceDevelopment.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldScienceDevelopment.setBackground(Color.red);
                        }
                        break;
                      
                      
                      
                 case "OldManagement":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldOldManagement.setText("Reachable");
                        PingerForIPJFrame.jTextFieldOldManagement.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldOldManagement.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldOldManagement.setBackground(Color.red);
                        }
                        break;  
                     
                     
                     
                case "NewManagement":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldNewManagement.setText("Reachable");
                        PingerForIPJFrame.jTextFieldNewManagement.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldNewManagement.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldNewManagement.setBackground(Color.red);
                        }
                        break;  
                          
                     
                    
              case "Library":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldLibrary.setText("Reachable");
                        PingerForIPJFrame.jTextFieldLibrary.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldLibrary.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldLibrary.setBackground(Color.red);
                        }
                        break;      
             
                  
                  
              case "Asnan":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAsnan.setText("Reachable");
                        PingerForIPJFrame.jTextFieldAsnan.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldAsnan.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldAsnan.setBackground(Color.red);
                        }
                        break; 
                  
             case "Madina":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMadina.setText("Reachable");
                        PingerForIPJFrame.jTextFieldMadina.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMadina.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldMadina.setBackground(Color.red);
                        }
                        break;       
                  
                  
                
        
        
              //new targets
        
             case "FoundarySwitch":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldFoundarySwitch.setText("Reachable");
                        PingerForIPJFrame.jTextFieldFoundarySwitch.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldFoundarySwitch.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldFoundarySwitch.setBackground(Color.red);
                        }
                        break;
                 
                 
                 
                 
             case "IPOQUE":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldIPOQUE.setText("Reachable");
                        PingerForIPJFrame.jTextFieldIPOQUE.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldIPOQUE.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldIPOQUE.setBackground(Color.red);
                        }
                        break;
                 
                 
                 
                 
              case "UAC":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldUAC.setText("Reachable");
                        PingerForIPJFrame.jTextFieldUAC.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldUAC.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldUAC.setBackground(Color.red);
                        }
                        break;
                  
                  
                  
              case "SymanticWebGateway":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldSymanticWebGateway.setText("Reachable");
                        PingerForIPJFrame.jTextFieldSymanticWebGateway.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldSymanticWebGateway.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldSymanticWebGateway.setBackground(Color.red);
                        }
                        break;
                  
                  
                  
              case "Firewall":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldFirewall.setText("Reachable");
                        PingerForIPJFrame.jTextFieldFirewall.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldFirewall.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldFirewall.setBackground(Color.red);
                        }
                        break;
                  
                  
                  
              case "Portal":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPortal.setText("Reachable");
                        PingerForIPJFrame.jTextFieldPortal.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldPortal.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldPortal.setBackground(Color.red);
                        }
                        break;
                  
                  
                  
               case "DNS":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldDNS.setText("Reachable");
                        PingerForIPJFrame.jTextFieldDNS.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldDNS.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldDNS.setBackground(Color.red);
                        }
                        break;
                   
                   
                   
               case "MIS":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMIS.setText("Reachable");
                        PingerForIPJFrame.jTextFieldMIS.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldMIS.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldMIS.setBackground(Color.red);
                        }
                        break;
                   
                   
                   
               case "TMGServer":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldTMGServer.setText("Reachable");
                        PingerForIPJFrame.jTextFieldTMGServer.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldTMGServer.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldTMGServer.setBackground(Color.red);
                        }
                        break;
                   
                   
                   
                case "Yahoo":
                            
                        if(isStatus())
                        {
                        PingerForIPJFrame.jTextFieldYahoo.setText("Reachable");
                        PingerForIPJFrame.jTextFieldYahoo.setBackground(Color.WHITE);
                        }
                        else if(!isStatus())
                        {
                        PingerForIPJFrame.jTextFieldYahoo.setText("Unreachable");
                        PingerForIPJFrame.jTextFieldYahoo.setBackground(Color.red);
                        }
                        break;
                    
                    

              //end new targets
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }//end switch(Name) of text fields
    }//  end UpdateFieldsStatus 
    
 //  end UpdateFieldsStatus   
    
    
    
    
    
    
    
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the IPAddress
     */
    public String getIPAddress() {
        return IPAddress;
    }

    /**
     * @param IPAddress the IPAddress to set
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * @return the Status
     */
    public boolean isStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
    
}//end PingTaskRunnable
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   