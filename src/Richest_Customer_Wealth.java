public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts={
            {1,2,3,4},
            {2,1},
            {3,8,1}
        };
        int solution=maximumWealth(accounts);
        System.out.println(solution);
    }

    public static int maximumWealth(int[][] accounts){
        int answer=0;
        for(int person=0; person<accounts.length; person++){
            int totalMoney=0;
            for(int account=0;account<accounts[person].length; account++){
                totalMoney=totalMoney+accounts[person][account];
            }
            if(totalMoney>answer){
                answer=totalMoney;
            }
        }
        return answer;

    }
}
