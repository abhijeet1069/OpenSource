#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]){
    printf("Hello,World (pid:%d)\n",(int)getpid());
    int rc = fork();
    if(rc < 0){
        fprintf(stderr,"fork failed \n");
        exit(1);
    }
    else if(rc == 0){
        printf("hello,");
    }
}