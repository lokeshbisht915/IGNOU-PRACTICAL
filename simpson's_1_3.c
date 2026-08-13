#include<stdio.h>
#include<math.h>


double fun(double x){
    return 1 / (1 + pow(x,2));
}

int main(){
    double a = 0;
    double b = 6;
    double h = 1;
    int n = ceil((b-a)/h);

    double x[n], y[n];
    
    double p = a;
    for(int i = 0; i<=n; i++){
        x[i]=p;
        y[i]=fun(p);
        p = p + h;
    }
    
    for(int i = 0; i<=n;i++){
    printf("%lf\t",x[i]);
    }
    printf("\n");
    for(int i = 0; i<=n;i++){
    printf("%lf\t",y[i]);
    }
    printf("\n");
    
    
    double sum= y[0] + y[n];
    printf("%lf\t",sum);
    for(int i = 1; i<=n; i++){
        if(i%2!=0){
            sum+= 4 * y[i];
            printf("%lf\t",sum);
        }else{
            sum+= 2 * y[i];
            printf("%lf\t",sum);
        }
    }
    
    sum *= h/3;
    
    printf("\n\n%lf the total sum", sum);
    
}