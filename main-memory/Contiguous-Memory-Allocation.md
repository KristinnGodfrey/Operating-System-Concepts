---
tags: Stýrikerfi
title: Assignment 19
---

#### First Fit:
Initially free:	| 15 KB	| 10 KB	| 26 KB	| 30 KB |	21 KB |	13 KB |	17 KB
----------------|-------|-------|-------|-------|-------|-------|-------
1. Allocation   |m2=8KB<br>8KB free||m1=16KB<br>10KB free|m3=20KB<br>10KB free|m4=14KB<br>7KB free|
2. Allocation   |m5=5KB<br>2KB free|
3. Allocation   |
<sup>Number of check steps: 14</sup>
<sup>3+1+4+5+1=14</sup>

#### Next Fit:
Initially free:	| 15 KB	| 10 KB	| 26 KB	| 30 KB |	21 KB |	13 KB |	17 KB
----------------|-------|-------|-------|-------|-------|-------|-------
1. Allocation   |       |       |m1=16KB<br>9KB free |m3=20KB<br>10KB free | m4=14KB<br>7KB free
2. Allocation   |       |       |m2=8KB<br>1KBfree | | m5=5KB<br>2KB free 
3. Allocation   |       |       |       |       |       |       |
<sup>Number of check steps: 9</sup>
<sup>3+1+2+2+1=9</sup>

#### Best Fit:
Initially free:	| 15 KB	| 10 KB	| 26 KB	| 30 KB |	21 KB |	13 KB |	17 KB
----------------|-------|-------|-------|-------|-------|-------|-------
1. Allocation   |m4=14KB<br>1KB free|m2=8KB<br>2KB free||       |m3=20KB<br>1KB free|m5=5KB<br>8KB free|m1=16KB<br>1KB free
2. Allocation   |
3. Allocation   |
<sup>Number of check steps: 35</sup>
<sup>7+7+7+7+7 = 35</sup>

#### Worst Fit:
Initially free:	| 15 KB	| 10 KB	| 26 KB	| 30 KB |	21 KB |	13 KB |	17 KB
----------------|-------|-------|-------|-------|-------|-------|-------
1. Allocation   |       |       |m2=8KB<br>18KB free|m1=16KB<br>14KB free|m3=20KB<br>1KB free| |m5=5KB<br>12KB free 
2. Allocation   |       |       |m4=14KB<br>4KB free |       |       |       |
3. Allocation   |       |       |       |       |       |       |
<sup>Number of check steps: 35</sup>
<sup>7+7+7+7+7 = 35</sup>
