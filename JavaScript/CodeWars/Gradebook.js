// Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

function getGrade (s1, s2, s3) {
  
    average = (s1 + s2 + s3) / 3;
    
    return average >= 90 ? "A" : average >= 80 ? "B" : average >= 70 ? "C" : average >= 60 ? "D" : "F";
  }