<template>
  <div class="to-do-item" :class="{ completed: todo.completed }">
    <span>{{ todo.title }}</span>
    <div class="controls">
      <span @click="deleteItem">🗑</span>
      <span @click="todo.completed ? uncompleteItem() : completeItem()">✓</span>
    </div>
  </div>
</template>

<script>

export default {
  props: {
    todo: {
      type: Object,
      default () {
        return {}
      }
    }
  },
  methods: {
    completeItem () {
      this.$services.todo.complete(this.todo).then((data) => {
        this.todo.completed = true
      })
    },
    deleteItem () {
      this.$services.todo.deleteItem(this.todo.id).then(() => {
        this.$emit('delete', this.todo)
      })
    },
    uncompleteItem () {
      this.$services.todo.uncomplete(this.todo).then((data) => {
        this.todo.completed = false
      })
    }
  }
}
</script>

<style lang="scss">
.to-do-item {
  width: 100%;
  display: block;
  height: 50px;
  &.completed {
    opacity: 0.2;
  }
  span {
    height: 50px;
    padding-left: 20px;
    line-height: 50px;
    width: 300px;
  }
  .controls {
    height: 50px;
    line-height: 50px;
    float:right;
    span {
      line-height: 50px;
      height: 50px;
      display: inline-block;
      width: 45px;
      text-align: center;
      padding: 0;
      cursor: pointer;
    }
  }
}
</style>
