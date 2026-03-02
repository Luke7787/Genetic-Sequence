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

### Program Details

- Language: Java  
- File: `EditDistance.java`  
- Functionality:
  - Reads two sequences from a text file
  - Computes edit distance using dynamic programming
  - Outputs the optimal alignment and total penalty

## How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-repository-url.git
cd your-repository-directory
```

### 2. Compile
```bash
javac EditDistance.java
```

### 3. Run
```bash
java EditDistance input.txt
```

The program outputs the edit distance and optimal alignment to the console.
