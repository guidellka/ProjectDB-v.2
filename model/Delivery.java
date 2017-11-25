
package model;

public class Delivery {
    private int deliveryNo;
    private String deliveryName;

    public int getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(int deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    @Override
    public String toString() {
        return "Delivery{" + "deliveryNo=" + deliveryNo + ", deliveryName=" + deliveryName + '}';
    }
    

}
