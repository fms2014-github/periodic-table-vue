<template>
  <div class="atom-table-cell">
    <span class="atom-name">{{ atomName }}</span>
    <span class="atom-num">{{ atomNum }}</span>
  </div>
</template>

<script>
export default {
  props: {
    atomName: {
      type: String,
      required: true,
    },
    atomNum: {
      type: String,
      required: true,
    },
  },
};
</script>

<style lang="scss"></style>
