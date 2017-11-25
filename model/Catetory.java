
package model;


public class Catetory {
    private int catetoryNo;
    private String catetotyName;

    public int getCatetoryNo() {
        return catetoryNo;
    }

    public void setCatetoryNo(int catetoryNo) {
        this.catetoryNo = catetoryNo;
    }

    

    public String getCatetotyName() {
        return catetotyName;
    }

    public void setCatetotyName(String catetotyName) {
        this.catetotyName = catetotyName;
    }

    @Override
    public String toString() {
        return "Catetory{" + "catetoryNo=" + catetoryNo + ", catetotyName=" + catetotyName + '}';
    }

    
   
}
