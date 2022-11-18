<template>
  <div class="atom-icon">
    <span class="atom-name">{{ atomName }}</span>
    <span class="atom-full-name">{{ atomFullName }}</span>
    <span class="atom-num">{{ atomNum }}</span>
  </div>
</template>

<script>
export default {
  props: {
    atomName: {
      type: String,
      require: true,
    },
    atomFullName: {
      type: String,
      require: true,
    },
    atomNum: {
      type: String,
      require: true,
    },
  },
};
</script>

<style></style>
