/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PingerForIP;

/**
 *
 * @author Marwan
 */
public class SinglePingTask {
    
    private PingTaskRunnable SinglePing;
    private String Name;
    private String IPAddress;
    
    public SinglePingTask(String Name,String IPAddress  )
    {
        setName(Name);
        setIPAddress(IPAddress);
        CreateAndInitialize();
        
    }//end constructor
    
    public void CreateAndInitialize()
    {
    
        SinglePing=new PingTaskRunnable(getName(), getIPAddress());
    }
    /**
     * @return the SinglePing
     */
    public PingTaskRunnable getSinglePing() {
        return SinglePing;
    }

    /**
     * @param SinglePing the SinglePing to set
     */
    public void setSinglePing(PingTaskRunnable SinglePing) {
        this.SinglePing = SinglePing;
    }

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
    
}
