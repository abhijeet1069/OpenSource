#ifndef __common_h__
#define __common_h__

#include <sys/time.h>
#include <sys/stat.h>
#include <assert.h>

/**
struct timeval {
               time_t      tv_sec;     //seconds 
               suseconds_t tv_usec;    //microseconds
           };
**/

double GetTime() { //get current time
    struct timeval t;
    int rc = gettimeofday(&t, NULL);
    assert(rc == 0);
    return (double) t.tv_sec + (double) t.tv_usec/1e6;
}

void Spin(int howlong) {
    double t = GetTime();
    while ((GetTime() - t) < (double) howlong) 
	; // If current time - startTime >= duration. Stop the loop
}

#endif 