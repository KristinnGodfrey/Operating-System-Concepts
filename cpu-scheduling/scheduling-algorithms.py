import pandas as pd

description = {
    'Processes': 			["P1",	"P2",	"P3",	"P4",	"P5"],
    'Arrival time':		    ["0",	"2",	"3",	"14",	"18"],
    'Service time': 		["4",	"11",	"8",	"5",	"4"],
    'Priority':			    ["mid",	"low",	"high",	"mid",	"high"]
}
description = pd.DataFrame(data=description)
print(description.T.to_string(header=False))
    
print() #newline

arrival = {
            'sup': ["P1","P1","P1","P1","-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-"  ],										
            'sup2': ["-","-" ,"P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ],					
            'sup3': ["-","-" ,"-" ,"P3","P3","P3","P3","P3","P3","P3","P3","-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-"  ],											
            'sup4': ["-","-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"P4","P4","P4","P4","P4","-" ,"-" ,"-" ],
            'sup5': ["-","-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"-" ,"P5","P5","P5","P5"]
}
arrival = pd.DataFrame(data=arrival)
print("Process arrival and duration:")
print(arrival.T.to_string(index=False))

print() #newline

algs = { 
            'FCFS': ["P1","P1","P1","P1","P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","P3","P3","P3","P3","P3","P3","P3","P3","P4","P4","P4","P4","P4","P5","P5","P5","P5"],
            'SJF': ["P1","P1","P1","P1","P3","P3","P3","P3","P3","P3","P3","P3","P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","P2","P5","P5","P5","P5","P4","P4","P4","P4","P4"],
            'SRTF': ["P1","P1","P1","P1","P3","P3","P3","P3","P3","P3","P3","P3","P2","P2","P4","P4","P4","P4","P4","P5","P5","P5","P5","P2","P2","P2","P2","P2","P2","P2","P2","P2",],
            'RR': ["P1","P1","P1","P1","P2","P2","P2","P2","P3","P3","P3","P3","P2","P2","P2","P2","P3","P3","P3","P3","P4","P4","P4","P4","P2","P2","P2","P5","P5","P5","P5","P4"],
            'RR-prio': ["P1","P1","P1","P1","P3","P3","P3","P3","P3","P3","P3","P3","P2","P2","P4","P4","P4","P4","P5","P5","P5","P5","P4","P2","P2","P2","P2","P2","P2","P2","P2","P2"]
}
algs = pd.DataFrame(data=algs)
print("Order of processes run:")
print(algs.T)