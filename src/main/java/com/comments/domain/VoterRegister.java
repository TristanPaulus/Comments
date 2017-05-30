package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class VoterRegister {

    private String subjectId;
    private String voterIpaddress;

    public VoterRegister(Builder b)
    {
        this.subjectId = b.subjectId;
        this.voterIpaddress = b.voterIpaddress;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getVoterIpaddress() {
        return voterIpaddress;
    }

    public static class Builder
    {
        private String subjectId;
        private String voterIpaddress;

        public Builder subjectId(String value)
        {
            this.subjectId = value;
            return this;
        }

        public Builder voterIpaddress(String value)
        {
            this.voterIpaddress = value;
            return this;
        }

        public VoterRegister build()
        {
            return new VoterRegister(this);
        }
    }
}
