
public class SpiralMatrix {

	public static void main(String[] args) {

		int SIZE = 10;
		int dx[] = {0,1,0,-1};
		int dy[] = {1,0,-1,0};
		int x,y,dir,j,k,n,currentLimit,i;

		int spiralArray [][] =new int[SIZE][SIZE];
		dir = 0;
		x = 0;
		y = -1;
		
		for(i = 1 ; i <= SIZE*SIZE ; i++)
		{

			
			x = x + dx[dir];
			y = y + dy[dir];
			spiralArray[x][y] = i;


			//check for a collision
			if((x + dx[dir] >= SIZE) || (x + dx[dir] < 0) || (y + dy[dir] >= SIZE ) || (y + dy[dir] < 0 ) || (spiralArray[x + dx[dir]][y + dy[dir]] != 0) )
			{
				dir = (dir + 1) % 4;
			}
			
		}

		
		for( k = 0; k < SIZE; k++)
		{
			for(j = 0; j < SIZE; j++)
				System.out.print(spiralArray[k][j]+" ");
			System.out.println();
		}
	
	}

}
