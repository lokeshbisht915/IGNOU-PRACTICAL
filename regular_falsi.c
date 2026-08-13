#include<stdio.h>

double fun(double x){
    return x * x * x * x - x - 10;
}

int main(){
    double x0, x1, x3;
    int counter;

    printf("Enter the upper and lower interval x1 and x2\nwhere the function return opposite sign");
    scanf("%lf %lf",&x0,&x1);

    printf("Enter the no iteration you want to perform ");
    scanf("%d",&counter);
    
    
    if((fun(x0)*fun(x1))<0){
        // printf("%lf '*' %lf = %lf\n",fun(x0),fun(x1),(fun(x0)*fun(x1)));
        int i = 1;
        while(i<=counter){
        printf("%lf '*' %lf = %lf\n",fun(x0),fun(x1),(fun(x0)*fun(x1)));    
        x3 = (x0 - (((x1 - x0) * fun(x0))/(fun(x1)-fun(x0))));
        printf("Interval: %d the lower limit: %lf upper limit: %lf Approxiation: %lf result: %lf\n ",i,x0,x1,x3,fun(x3));
        
        if((fun(x3)<0)){
            x0 = x3;
        }else{
            x1 = x3;
        }
        i++;
        }
    printf("Approximation root: %lf",x3);
        
    }else{
        printf("these two interval are invalid.");
    }
}