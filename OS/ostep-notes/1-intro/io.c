#include <stdio.h>
#include <unistd.h>
#include <assert.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/stat.h>
#include <string.h>

int main(int argc, char* argv[]){
    int fd = open("/Users/satyam/Personal/OpenSource/OS/file.txt",O_WRONLY | O_CREAT | O_TRUNC, S_IRUSR | S_IWUSR); //opens the file and create it
    assert(fd >= 0);
    char buffer[20];
    sprintf(buffer,"hello, world\n");
    int rc = write(fd,buffer,strlen(buffer));
    assert(rc == (strlen(buffer)));
    fsync(fd);
    close(fd);
    return 0;
}


/**
The software in the OS that usually manages the disk is called the file system.
OS is sometimes seen as a standard library.
A device driver is some code in the OS that knows how to deal with a specific device.
**/