#ifndef LOGGER_H
#define LOGGER_H

void logger(const char* message, int line,const char* functionName);

#define LOG(message) logger(message , __LINE__ , __func__)


#endif /* LOG_H */