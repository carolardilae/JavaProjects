
package relationaloperatorsexample3;

public class GreatherThanEqualTo {

    public static void main(String[] args) {
        double recommendedWaterInTake = 8;
        double daysInChallenge = 30;
        double yourWaterInTake = 235.5;
        double totalRecommendedAmount = recommendedWaterInTake*daysInChallenge;
        System.out.println(totalRecommendedAmount);
        boolean isChallengeComplete = yourWaterInTake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);
    }
    
}
