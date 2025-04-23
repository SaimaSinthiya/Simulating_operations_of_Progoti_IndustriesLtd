package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;

public class UserPermission implements Serializable {
    private String userId;
    private String role;
    private boolean canView;
    private boolean canEdit;
    private boolean canDelete;

    public UserPermission(String userId, String role, boolean canView, boolean canEdit, boolean canDelete) {
        this.userId = userId;
        this.role = role;
        this.canView = canView;
        this.canEdit = canEdit;
        this.canDelete = canDelete;
    }

    public String getUserId() { return userId; }
    public String getRole() { return role; }
    public boolean isCanView() { return canView; }
    public boolean isCanEdit() { return canEdit; }
    public boolean isCanDelete() { return canDelete; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setRole(String role) { this.role = role; }
    public void setCanView(boolean canView) { this.canView = canView; }
    public void setCanEdit(boolean canEdit) { this.canEdit = canEdit; }
    public void setCanDelete(boolean canDelete) { this.canDelete = canDelete; }

    @Override
    public String toString() {
        return "UserPermission{" +
                "userId='" + userId + '\'' +
                ", role='" + role + '\'' +
                ", view=" + canView +
                ", edit=" + canEdit +
                ", delete=" + canDelete +
                '}';
    }
}
