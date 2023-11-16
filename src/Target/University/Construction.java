/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Target.University;

/**
 *
 * @author Administrator
 */
public class Construction 


{
   private String Name;
   private String IPAddress;
   private String Type;
   private String Address;

   public Construction()
   {
   }//end constructor

   public Construction(String nm,String IP,String type)
   {
       SetIPAddress(IP);
       SetName(nm);
       SetType(type);
   }//end constructor
   public void SetName(String PlaceName)
   {this.Name=PlaceName;
   
   }//end set Name     

   public void SetAddress(String PlaceAddress)
   {this.Address=PlaceAddress;
   
   }//end set Address
   
   
   public void SetIPAddress(String PlaceIPAddress)
   {this.IPAddress=PlaceIPAddress;
   
   }//end set IPAddress
   
   public void SetType(String PlaceType)
   {this.Type=PlaceType;
   
   }//end set type
      

   



   public String GetName()
   {
       return this.Name;
   
   }//end Get Name     

   public String GetAddress()
   {
       return this.Address;
   
   }//end Get Address
   
   
   public String GetIPAddress()
   {
       return this.IPAddress;
   
   }//end Get IPAddress
   
   public String GetType()
   {
       return this.Type;
   
   }//end Get type




}//end construction class
