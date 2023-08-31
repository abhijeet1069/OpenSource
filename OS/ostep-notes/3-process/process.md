# Process
Process is a running program.

# Time Sharing
Time sharing is a basic technique used by an OS to share a resource. By allowing the resource to be used for a little 
while by one entity, and then a little while by another, and so forth, the resource in question (e.g., the CPU, or a 
network link) can be shared by many.

# Process States
a) Running - Process running on a processor.
b) Ready - Ready to run but not running
c) Blocked - Process has performed some kind of operation that makes it not ready to run until some event takes place.
             For ex : Process initiates an I/O request to a disk.

# Homework
cpu-intro

# Process API
fork()
exec()
wait()
