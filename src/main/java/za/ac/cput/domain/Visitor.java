package za.ac.cput.domain;

import java.time.LocalDate;

public class Visitor {

    private int visitorId;
    private String visitorFirstName;
    private String visitorLastName;
    private String visitorEmail;
    private String visitorPhoneNumber;
    private LocalDate hireTime;

    public Visitor() {

    }

    public Visitor(Builder builder) {
        this.visitorId = builder.visitorId;
        this.visitorFirstName = builder.visitorFirstName;
        this.visitorLastName = builder.visitorLastName;
        this.visitorEmail = builder.visitorEmail;
        this.visitorPhoneNumber = builder.visitorPhoneNumber;
        this.hireTime = builder.hireTime;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public String getVisitorFirstName() {
        return visitorFirstName;
    }

    public String getVisitorLastName() {
        return visitorLastName;
    }

    public String getVisitorPhoneNumber() {
        return visitorPhoneNumber;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public LocalDate getHireTime() {
        return hireTime;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "visitorId=" + visitorId +
                ", visitorFirstName='" + visitorFirstName + '\'' +
                ", visitorLastName='" + visitorLastName + '\'' +
                ", visitorEmail='" + visitorEmail + '\'' +
                ", visitorPhoneNumber='" + visitorPhoneNumber + '\'' +
                ", hireTime=" + hireTime +
                '}';
    }

    public static class Builder {
        private int visitorId;
        private String visitorFirstName;
        private String visitorLastName;
        private String visitorEmail;
        private String visitorPhoneNumber;
        private LocalDate hireTime;

        public Builder visitorId(int visitorId) {
            this.visitorId = visitorId;
            return this;
        }

        public Builder visitorFirstName(String visitorFirstName) {
            this.visitorFirstName = visitorFirstName;
            return this;
        }

        public Builder visitorLastName(String visitorLastName) {
            this.visitorLastName = visitorLastName;
            return this;
        }

        public Builder visitorEmail(String visitorEmail) {
            this.visitorEmail = visitorEmail;
            return this;
        }

        public Builder visitorPhoneNumber(String visitorPhoneNumber) {
            this.visitorPhoneNumber = visitorPhoneNumber;
            return this;
        }

        public Builder hireTime(LocalDate hireTime) {
            this.hireTime = hireTime;
            return this;
        }

        public Visitor build() {
            return new Visitor(this);
        }
    }
}
