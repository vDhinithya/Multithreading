for refrence use :- [Medium](https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6)


    CPU :- CPU often referred to as the brain of the computer, is responsible for executing instructions from programs. It performs basic arithmetic, logic, control, and I/O operations specified by instrunctions.
    CORE :- This is the main part where operations are performed. Core is individual processing unit within a CPU. Modern CPU can have multiple cores, allowing them to perform multiple tasks simultaneously.
           A quad-core processor has four cores, allowing it to perform 4 tasks simultaneously, i.e. web browsing, music player, download manager, system update in background.
    Program :- set of instructions, that tell computer how to perform specific task
    Process :- It is an instance of the program that is being executed. When a program runs, the OS creates a process to manage its execution.
    Thread :- A thread is the smallest unit of execution within a process. A process can have multiple threads, which share the same resources but can run independently.
              A web browser like chrome might use multiple threads for different tabs, with each tab running as a separate thread.

    Multitasking :- Multitasking allows an operating system to run multiple processes simultaneously.
                    On single-core CPUs, this is done through time-sharing, rapidly switching between tasks.
                    On multi-core CPUs, true parallel execution occurs, with tasks distributed across cores.
                    The OS scheduler balances the load, ensuring efficient and responsive system performance.
                    Multitasking utilizes the capabilities of a CPU and its cores. When an operating system performs multitasking, it can assign different tasks to different cores.
                    This is more efficient than assigning all tasks to a single core.

    MULTITHREADING :- it refers to the ability to execute multiple threads within a single process concurrently.
                     let suppose we run multiple tasks i.e. running web browser, playing music, this is multitasking
                     whereas a web browser can use multi-threading by having separate threads for rendering the pages, running JS and managing inputs, making browers more responsive and efficient.
                     Multithreading enhances the efficiency of multitasking by breaking down individual tasks into smaller sub-tasks or threads. These threads can be processed simultaneously, making better use of the CPU's capabilities.

                     In a single-core system: Both threads and processes are managed by the OS scheduler through time slicing and context switching to create the illusion of simultaneous execution.
                     In a multi-core system: Both threads and processes can run in true parallel on different cores, with the OS scheduler distributing task across the cores to optimize performance.
    Time Slicing
        Definition: Time slicing divides CPU time into small intervals called time slices or quanta.
        Function: The OS scheduler allocates these time slices to different processes and threads, ensuring each gets a fair share of CPU time.
        Purpose: This prevents any single process or thread from monopolizing the CPU, improving responsiveness and enabling concurrent execution.

    Context Switching
        Definition: Context switching is the process of saving the state of a currently running process or thread and loading the state of the next one to be executed.
        Function: When a process or thread's time slice expires, the OS scheduler performs a context switch to move the CPU's focus to another process or thread.
        Purpose: This allows multiple processes and threads to share the CPU, giving the appearance of simultaneous execution on a single-core or improving parallelism on multi-core CPUs.

    Multitasking can be achieved through multithreading where each task is divided into threads that are managed concurrently.
    While multitasking typically refers to the running of multiple applications, multithreading is more granular, dealing with multiple threads within the same application or process.

    Multitasking operates at the level of processes, which are the operating system's primary units of execution.
    Multithreading operates at the level of threads, which are smaller units within a process

    Multitasking involves managing resources between completely separate programs, which may have independent memory spaces and system resources.
    Multithreading involves managing resources within a single program, where threads share the same memory and resources.

    Multitasking allows us to run multiple applications simultaneously, improving productivity and system utilization.
    Multithreading allows a single application to perform multiple tasks at the same time, improving application performance and responsiveness.

    The office manager (operating system) assigns different employees (processes) to work on different projects (applications) simultaneously. Each employee works on a different project independently.
    Within a single project (application), a team (process) of employees (threads) works on different parts of project at the same time, collaborating and sharing resources.

    