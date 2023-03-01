#include <stdio.h>
//#define r 3
//#define c 3

int main()
{
    int r,c;
    printf("Enter the no of rows : ");
    scanf("%d",&r);
    printf("Enter the no of columns : ");
    scanf("%d",&c);
    int array[r][c];
    int row, col, upper=0;
    printf("Enter elements in matrix of size %dx%d: \n", r,c);
    for(row=0;row<r;row++){
        for(col=0;col<c;col++){
            scanf("%d",&array[row][col]);
        }
    }
    for(row=0; row<r; row++){
        for(col=0; col<c; col++){
            if(col<row && array[row][col]!=0){
                upper = 1;
            }
        }
    }
    if(upper == 0){
        printf("\nThe matrix is upper triangular matrix.\n");
    }
    else{
        printf("\nThe matrix is not upper triangular matrix.");
    }return 0;
}
