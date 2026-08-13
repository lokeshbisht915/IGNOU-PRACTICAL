#include<stdio.h>

double fun(double x){
    return x * x * x * x - x - 10;
}

int main(){
    double x1, x2, x3;
    int counter;

    printf("Enter the upper and lower interval x1 and x2\nwhere the function return opposite sign");
    scanf("%lf %lf",&x1,&x2);

    printf("Enter the no iteration you want to perform ");
    scanf("%d",&counter);
    
    
    if((fun(x1)*fun(x2))<0){
        printf("1");
        int i = 1;
        while(i<=counter){
            
        x3 = (x1 + x2)/2;
        printf("Interval: %d the lower limit: %lf upper limit: %lf Approxiation: %lf result: %lf\n ",i,x1,x2,x3,fun(x3));
        
        if((fun(x3)<0)){
            x1 = x3;
        }else{
            x2 = x3;
        }
        i++;
        }
    printf("Approximation root: %lf",x3);
        
    }else{
        printf("these two interval are invalid.");
    }
}