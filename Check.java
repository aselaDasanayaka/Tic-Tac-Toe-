/********************************
*	check matrix and check who wins is done in this class
*
*****************************/
public class Check {
public int [][]mat = {{2,2,2},{2,2,2},{2,2,2}};  // default value for matrix is 2
	
	public int getVal(int i,int j){		// this function returns current positions value
		return this.mat[i][j];
	}
	
	public void putVal(int v,int i,int j){	// this function put values to function 
		this.mat[i][j]=v;
	}
	
	public int checkWin(){     		// this function analize function and check whos win
		
		int onex = 0;
		int zerox = 0;
		
		int oney = 0;
		int zeroy = 0;
		
		int diozero =0;
		int cdiozero =0;
		
		int dioone =0;
		int cdioone =0;
		
		int flag=0;
		
		for(int i=0;i<3;i++){
			
			onex = 0;zerox = 0;oney = 0;zeroy = 0;diozero =0;cdiozero =0;dioone =0;cdioone =0;
						
			for(int j=0;j<3;j++){
				
				if(this.mat[i][j]==1) onex++;
				if(this.mat[i][j]==0) zerox++;
				
				if(this.mat[j][i]==1) oney++;
				if(this.mat[j][i]==0) zeroy++;
				
				if(this.mat[j][j]==1) dioone++;
				if(this.mat[j][j]==0) diozero++;
				
				if(this.mat[j][2-j]==1) cdioone++;
				if(this.mat[j][2-j]==0) cdiozero++;								
			}
			if(onex == 3 || oney == 3 || dioone== 3 || cdioone== 3){
				flag = 1;
				break;
			}
			
			if(zerox == 3 || zeroy == 3 || diozero== 3 || cdiozero== 3){
				flag = 2;
				break;
			}				
		}
		
		if(flag==1) return 1;
		if(flag==2) return 2;
		
		return 0;
	}
}
