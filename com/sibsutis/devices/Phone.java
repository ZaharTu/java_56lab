package com.sibsutis.devices;

import java.util.Objects;

class Phone extends Device{
    

    public Phone(int id, int price, String ip){
        super(id,price,ip);
    }
    public Phone(int id, int price){
        super(id,price,"None");
    }
    @Override
    public String getDeviceType(){
        return "Phone";
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(),getPrice(),getId(),getDeviceType());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj==null || getClass() != obj.getClass()){
            return false;
        }
        Phone other = (Phone) obj;
        return this.getId() == other.getId() &&
                this.getPrice() == other.getPrice() &&
                Objects.equals(getIp(), other.getIp()); //т.к. в первый конструктор можно закинуть null в ip.
    }
}
 
