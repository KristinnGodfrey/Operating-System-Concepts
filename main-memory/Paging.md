---
tags: Stýrikerfi
title: Assignment 20
---

<details closed>
<summary>Into how many pages is the logical address space divided?</summary>
8-bit logical address = 2⁸ 
Divided into pages of 64 byte size. 
2⁸ / 64 = 4 pages
</details>

<details closed>
<summary>Into how many frames is the physical address space divided?</summary>
10-bit physical address = 2¹⁰
Divided into frames of 64 byte size.
2¹⁰ / 64 = 16 frames
</details>

<details closed>
<summary>What is the maximum degree of multiprogramming if no swapping is used in this system?</summary>
16 frames can be fit into 4 * 4 pages.
The maximum degree of multiprogramming is 4.
</details>

<details closed>
<summary>Is it possible to make a statement about how many processes can be in the system at the same time if swapping (or demand paging) is used?</summary>
The amount of processes that can be in the system is dependent on the storage device used for swapping out processes.
</details>

<details closed>
<summary>How many entries does a page table have in this system?</summary>
The amount of entries is the same as the pages of our logical address space. We have 4 pages so the page table has 4 entries.
</details>

<details closed>
<summary> How many bits are needed for each page table entry if each page table entry consists of
just the minimal required number of bits for the frame number and the valid bit?</summary>
Frame number: 4 bits (2ⁿ = 16)
Valid bit: 1 bit
We need 5 bits all in all.
</details>

<details closed>
<summary>What is the physical address of logical address 42?</summary>
42 is located in page 0 (0...99)
Offset of address within that page is 42
According to the page table, page 0 is mapped to frame 0
With offset 42, the resulting physical address is 42
</details>

<details closed>
<summary>What is the physical address of logical address 191?</summary>
191 is located in page 1 (0...199)
Offset of that address within that page is 91
According to the page table, page 1 is mapped to frame 4
With offset 91, the resulting address is 491
</details>

