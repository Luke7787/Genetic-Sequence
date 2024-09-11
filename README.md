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

### Example

Here is an example of two possible alignments of the sequences:
