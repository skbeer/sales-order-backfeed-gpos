package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.schema.EmployeeType;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Apr 28, 2009
 * Time: 9:53:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeInfo {
    private String userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String roleCode;
    private long accountId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public EmployeeType extractEmployeeType() throws Exception {
        EmployeeType employeeType = new EmployeeType();
        employeeType.setUserId(getUserId());
        employeeType.setRoleCode(getRoleCode());
        employeeType.setFirstName(getFirstName());
        employeeType.setLastName(getLastName());
        employeeType.setEmailAddress(getEmailAddress());
        return employeeType;
    }
}
