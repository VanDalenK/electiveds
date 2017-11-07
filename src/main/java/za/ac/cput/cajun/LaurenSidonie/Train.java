package za.ac.cput.cajun.LaurenSidonie;

public class Train {

    private int trainId;
    private String model;

    public Train(int trainId, String model) {
        this.trainId = trainId;
        this.model = model;

    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        return trainId  == train.trainId;
    }

    @Override
    public int hashCode() {
        return trainId;
    }

}
