<template>
  <div class="atom-info">
      {{atomInfo}}
  </div>
</template>

<script>
export default {
  props:{
    atomInfo:{
      type: String,
      require: true
    }
  }
}
</script>

<style>

</style>