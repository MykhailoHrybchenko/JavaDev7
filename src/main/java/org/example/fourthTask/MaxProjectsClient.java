package org.example.fourthTask;

public class MaxProjectsClient {
    private String name;
    private int projectCount;

    public MaxProjectsClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    @Override
    public String toString() {
        return "MaxProjectsClient{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
