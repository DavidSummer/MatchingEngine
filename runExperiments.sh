#sbt "run Welfare Utilitarian" 2>&1 | tee -a experiments/data/welfareUtilitarian.csv
sbt "run Time Utilitarian" 2>&1 | tee -a experiments/data/timeUtilitarian.csv

