#include "logger.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void logger(const char* message, int line,const char* functionName) {
   time_t current_time;
    struct tm *time_info;
    
    // Get the current time
    time(&current_time);
    
    // Convert to local time (IST)
    time_info = localtime(&current_time);

    // Format the time in IST format (HH:MM:SS DD-MM-YYYY)
    char formatted_time[20];
    strftime(formatted_time, sizeof(formatted_time), "%H:%M:%S %d-%m-%Y", time_info);
    
    //printf("Current IST time: %s\n", formatted_time);

    printf("[%s] [%s:%d] %s\n", formatted_time, functionName, line , message);
}
