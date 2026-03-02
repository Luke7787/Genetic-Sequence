# Edit Distance & Global Sequence Alignment

CSC 349 Design and Analysis of Algorithms project at Cal Poly implementing edit distance and global sequence alignment for DNA strings. Computes optimal alignments to measure similarity between genetic sequences.

### Biology Review

A genetic sequence is a string over the four-letter DNA alphabet: A (Adenine), T (Thymine), G (Guanine), and C (Cytosine). Genes are segments of DNA that encode the information required to build proteins. The genome represents the complete set of genetic material in an organism, and small mutations can introduce variations. Comparing DNA sequences helps measure similarity and identify biological relationships between organisms.

### The Problem

Given two DNA sequences:

- Sequence 1: `AACAGTTACC`
- Sequence 2: `TAAGGTCA`

Compute the edit distance between the sequences using dynamic programming. Edit distance measures similarity by assigning penalties for insertions, deletions, and mismatches, with the objective of finding the alignment that minimizes total cost.

### Penalty Scheme

- Gap insertion: 2
- Mismatch: 1
- Match: 0

## Implementation

### Program Details

- **Language**: Java
- **File**: `EditDistance.java`
- **Functionality**:
  - Reads two strings of characters from a text file.
  - Computes the edit distance using dynamic programming.
  - Recovers and prints the optimal alignment along with individual penalties.


## How to Run the Project

1. **Clone the Repository**
   - Clone the repository to your local machine:
     ```bash
     git clone https://github.com/your-repository-url.git
     cd your-repository-directory
     ```

2. **Compile the Program**
   - Ensure you have Java installed on your system. Compile the Java program using:
     ```bash
     javac EditDistance.java
     ```

3. **Run the Program**
   - Execute the compiled program and provide an input file containing the DNA sequences:
     ```bash
     java EditDistance input.txt
     ```

4. **View Results**
   - The output will include the edit distance and the alignment details. Results will be printed to the console.

5. **Adjust Input File and Toggle Output**
   - Modify the `EditDistance.java` file to change the input file or toggle alignment output as needed.
