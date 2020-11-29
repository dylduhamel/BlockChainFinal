package com.company;

public class Artifact {
    private String artifactID;
    private String artifactName;
    private String artifactCountry;
    private Stakeholder currOwner;

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactID=" + artifactID +
                ", artifactName='" + artifactName + '\'' +
                ", artifactCountry='" + artifactCountry + '\'' +
                ", currOwner=" + currOwner +
                '}';
    }

    public String getArtifactID() {
        return artifactID;
    }

    public void setArtifactID(String artifactID) {
        this.artifactID = artifactID;
    }

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public String getArtifactCountry() {
        return artifactCountry;
    }

    public void setArtifactCountry(String artifactCountry) {
        this.artifactCountry = artifactCountry;
    }

    public Stakeholder getCurrOwner() {
        return currOwner;
    }

    public void setCurrOwner(Stakeholder currOwner) {
        this.currOwner = currOwner;
    }
}
