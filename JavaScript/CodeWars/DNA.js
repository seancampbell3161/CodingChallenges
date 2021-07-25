/*
In DNA strings, symbols "A" and "T" are complements of each other, 
as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you
 need to get the other complementary side.
*/

function DNAStrand(dna){
  
    let sequence = {
      "T" : "A",
      "A" : "T",
      "C" : "G",
      "G" : "C"
    }
    
    return dna.replace(/A|T|G|C/g, function(matched) {
      return sequence[matched];
    });
  }