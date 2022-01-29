package com.sunglowsys.domain;

public class Address {
        private Long id;
        private String houseNo;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String state;
        private String country;

        public Address(){
                System.out.println("Address object created successfully");
        }


        public Address(Long id, String houseNo, String addressLine1, String addressLine2, String addressLine3, String state, String country) {
                this.id = id;
                this.houseNo = houseNo;
                this.addressLine1 = addressLine1;
                this.addressLine2 = addressLine2;
                this.addressLine3 = addressLine3;
                this.state = state;
                this.country = country;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getHouseNo() {
                return houseNo;
        }

        public void setHouseNo(String houseNo) {
                this.houseNo = houseNo;
        }

        public String getAddressLine1() {
                return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
                this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
                return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
                this.addressLine2 = addressLine2;
        }

        public String getAddressLine3() {
                return addressLine3;
        }

        public void setAddressLine3(String addressLine3) {
                this.addressLine3 = addressLine3;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        public void checkAddress(){
                System.out.println("Address Id = " +100);
                System.out.println("House No = " + 523);
                System.out.println("AddressLine1 = " + "vill-Rampur");
                System.out.println("AddressLine2 = " + "post-Mohanpura");
                System.out.println("AddressLine3 = " + "dist-Kasganj");
                System.out.println("State = " + "Uttar Pradesh");
                System.out.println("Country = " + "India");
        }
}
