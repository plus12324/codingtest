
public class Sort {
	public void quickSort(int[] a){
		quickSort(a, 0, a.length-1);
		System.out.printf("\n삽입정렬 %d 단계 : ", 1);
        for(int v : a) {
            System.out.printf("%3d ", v);
        }
	}
	public void quickSort(int[] a, int start, int end){
		int part2 = partition(a,start,end);
		if(start <part2-1)
			quickSort(a,start,part2-1);
		if(part2 < end)
			quickSort(a,part2,end);
	}
	public int partition(int[] a , int start , int end){
		int pivot = a[(start + end) /2];
		while(start <= end){
			while(a[start] < pivot) start ++;
			while(pivot < a[end]) end--;
			
			if(start <=end){
				swap(a,start, end	);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public void swap(int[] a, int idx1, int idx2){
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	public void selectionSort2(int[] a){
		selectionSortR(a,0);
		
	}
	
	public void selectionSortR(int[] a, int idx){
		if(idx < a.length){
			int min = idx;
			for(int j=idx+1 ; j<a.length ; j++){
				if (a[j] < a[min]) min = j;
			}
			swap(a,min, idx);
			
			System.out.printf("\n선택 정렬 %d 단계 : ", idx+1);
	        for(int v : a) {
	            System.out.printf("%3d ", v);
	        }
	        
	        selectionSortR( a, idx+1);
		}
	}
	
	public void selectionSort(int[] a){
		for(int i=0 ; i<a.length ; i++){
			
			int min = i;
			for(int j=i+1 ; j<a.length ; j++){
				if (a[j] < a[min]) min = j;
			}
			swap(a,min, i);
			
			System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
		}
	}
	
	public void bubbleSort2(int[] a){
		
		bubbleSortR(a,a.length-1);
		
	}
	public void bubbleSortR(int[] a, int idx){
		if(idx > 0){
			for(int j=0 ; j<idx ; j++){
				if(a[j] > a[j+1]) swap(a,j,j+1);
			}
			
			System.out.printf("\n버블정렬 %d 단계 : ", idx);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
			
			bubbleSortR(a, --idx);
		}
	}
	
	public void bubbleSort(int[] a){
		for(int i=a.length-1 ; i>0 ; i--){
			for(int j=0 ; j<i ; j++){
				if(a[j] > a[j+1]) swap(a,j,j+1);
			}
			
			System.out.printf("\n버블정렬 %d 단계 : ", i);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
		}
	}
	
	public void insertionSort(int[] a){
		for (int i=1 ; i<a.length ; i++){
			int tmp = a[i];
			int j = i;
			while(j>0 && a[j-1] > tmp){
				a[j] = a[j-1];
				--j;
			}
			a[j] = tmp;
			
			System.out.printf("\n삽입정렬 %d 단계 : ", i);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
		}
	}
	
	public static void main(String[] args) {
		int b=0;
		System.out.println(String.valueOf(++b));
		// TODO Auto-generated method stub
		int[] a = {32, 1,14,3,8,2,10};
		System.out.println("32, 1,  14,  3,  8,  2,  10");
		Sort s = new Sort();
//		s.selectionSort2(a);
//		s.bubbleSort2(a);
//		s.insertionSort(a);
		s.quickSort(a);

	}

}
