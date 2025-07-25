package thareesha.career.CareerProject.models;


public class CareerResponse {
    private String recommendedCareer;

    public CareerResponse() {}

    public CareerResponse(String recommendedCareer) {
        this.recommendedCareer = recommendedCareer;
    }

    public String getRecommendedCareer() {
        return recommendedCareer;
    }

    public void setRecommendedCareer(String recommendedCareer) {
        this.recommendedCareer = recommendedCareer;
    }
}
