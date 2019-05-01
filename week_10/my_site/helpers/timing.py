import time

def timing_function(callback):
    def wrapper():
        time1 = time.time()
        callback()
        time2 = time.time()
        return "Time it took to run the function: " + str((time2 - time1)) + "\n"
    return wrapper
