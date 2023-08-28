#include <stdio.h>
#include <stdlib.h>
#include "common.h"

int main(int argc, char *argv[])
{
    if (argc != 2) {
	fprintf(stderr, "usage: cpu <string>\n");
	exit(1);
    }
    char *str = argv[1];

    while (1) {
	printf("%s\n", str);
	Spin(1);
    }
    return 0;
}

/**
 *
Running many programs at once:  Here, OS works as a resource manager. Concurrently, running 4 programs at once.
    ./cpu A & ./cpu B & ./cpu C & ./cpu D

*/