class Solution:
    def getOrder(self, tasks: List[Tuple[int, int]]) -> List[int]:
        num_tasks = len(tasks)
        task_list = [Task(i, tasks[i][0], tasks[i][1]) for i in range(num_tasks)]

        task_list.sort(key = lambda a: a.enqueue_time)

        priority_queue = []
        heapify(priority_queue)
        result = [0] * num_tasks
        result_index = 0
        task_index = 0
        current_time = 0

        while result_index < num_tasks:
            while task_index < num_tasks and task_list[task_index].enqueue_time <= current_time:
                heappush(priority_queue, task_list[task_index])
                task_index += 1
            if not priority_queue:
                current_time = task_list[task_index].enqueue_time
            else:
                current_time += priority_queue[0].processing_time
                result[result_index] = heappop(priority_queue).index
                result_index += 1
        return result

class Task:
    def __init__(self, index: int, enqueue: int, processing: int):
        self.index = index
        self.enqueue_time = enqueue
        self.processing_time = processing

    def __lt__(self, other):
        if self.processing_time == other.processing_time:
            return self.index < other.index
        return self.processing_time < other.processing_time
        
