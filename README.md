# Edit Distance/Global Sequence Alignment

## Introduction

A project for CSC 349: Design and Analysis of Algorithms at California Polytechnic State University. This program computes the optimal sequence alignment of two DNA strings, introducing concepts from computational biology where computers are used to research biological systems. By calculating the edit distance between genetic sequences, the program helps in quantifying the similarity between sequences, which can be useful in various biological and computational applications.

## Problem Description

### Biology Review

A genetic sequence is a string formed from a four-letter alphabet {Adenine (A), Thymine (T), Guanine (G), Cytosine (C)} of biological macromolecules known as DNA bases. Genes are sequences of DNA that contain the information needed to construct proteins. The human genome is the complete set of genes within an organism, and slight mutations in these genes can lead to variations. Comparing genetic sequences from different organisms can help determine their similarities and differences.

### The Problem

Given two genetic sequences:
- **Sequence 1**: `AACAGTTACC`
- **Sequence 2**: `TAAGGTCA`

The task is to compute the edit distance between these sequences using a dynamic programming approach. Edit distance is a measure of similarity where penalties are assigned for insertions, deletions, and mismatches. The goal is to find the alignment with the minimal cost.

### Penalty Table

- **Insert a gap**: 2
- **Align two characters that mismatch**: 1
- **Align two characters that match**: 0

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
